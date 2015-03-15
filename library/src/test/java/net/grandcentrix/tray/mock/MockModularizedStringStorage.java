/*
 * Copyright (C) 2015 grandcentrix GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.grandcentrix.tray.mock;

import net.grandcentrix.tray.storage.ModularizedStorage;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by pascalwelsch on 11/21/14.
 */
public class MockModularizedStringStorage extends ModularizedStorage<String> {

    private HashMap<String, String> data = new HashMap<>();

    private int version = 0;

    public MockModularizedStringStorage(final String module) {
        super(module);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public String get(@NonNull final String key) {
        return data.get(key);
    }

    @NonNull
    @Override
    public Collection<String> getAll() {
        return data.values();
    }

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void put(@NonNull final String key, @Nullable final String migrationKey,
            @Nullable final Object data) {

    }

    @Override
    public void put(@NonNull final String key, final Object data) {
        this.data.put(key, String.valueOf(data));
    }

    @Override
    public void remove(@NonNull final String key) {
        data.remove(key);
    }

    @Override
    public void setVersion(final int version) {
        this.version = version;
    }
}
