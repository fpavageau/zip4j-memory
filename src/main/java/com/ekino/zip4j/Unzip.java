/*
 * Copyright 2019 Frank Pavageau
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ekino.zip4j;

import java.io.IOException;
import java.nio.file.Files;

import net.lingala.zip4j.ZipFile;

public class Unzip {
    public static void main(String... args)
            throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: Unzip file");
            System.exit(1);
        }

        var directory = Files.createTempDirectory("unzip");
        System.out.println("Unzipping files from " + args[0] + " to " + directory);
        ZipFile file = new ZipFile(args[0]);
        file.extractAll(directory.toString());
    }
}
