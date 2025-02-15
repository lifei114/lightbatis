/*
 * Copyright 2004-2015 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package titan.lightbatis.dataset.util;

import titan.lightbatis.dataset.exception.IORuntimeException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * {@link FileInputStream}用のユーティリティクラスです。
 * 
 * @author higa
 * 
 */
public class FileInputStreamUtil {

    /**
     * インスタンスを構築します。
     */
    protected FileInputStreamUtil() {
    }

    /**
     * {@link FileInputStream}を作成します。
     * 
     * @param file
     * @return {@link FileInputStream}
     * @throws IORuntimeException
     *             {@link IOException}が発生した場合
     * @see FileInputStream#FileInputStream(File)
     */
    public static FileInputStream create(File file) throws IORuntimeException {
        try {
            return new FileInputStream(file);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }
}