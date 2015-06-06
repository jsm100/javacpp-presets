/*
 * Copyright (C) 2014,2015 Samuel Audet
 *
 * This file is part of JavaCPP.
 *
 * JavaCPP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version (subject to the "Classpath" exception
 * as provided in the LICENSE.txt file that accompanied this code).
 *
 * JavaCPP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaCPP.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Samuel Audet
 */
@Properties(inherit = opencv_core.class, value = {
    @Platform(include = {"<opencv2/flann/defines.h>", "<opencv2/flann/miniflann.hpp>"}, link = "opencv_flann@.3.0"),
    @Platform(value = "windows", link = "opencv_world300")},
        target = "org.bytedeco.javacpp.opencv_flann")
public class opencv_flann implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("FLANN_EXPORT", "FLANN_DEPRECATED").cppTypes());
    }
}
