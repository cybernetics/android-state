/* *****************************************************************************
 * Copyright (c) 2017 Frankie Sardo, and Evernote Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Frankie Sardo - initial API and implementation
 *    Ralf Wondratschek - documentation and feature enhancement
 *******************************************************************************/
package com.evernote.android.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.SparseArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

@SuppressWarnings({"unused", "SameParameterValue"})
public final class InjectionHelper {
    private final String mBaseKey;
    private final Map<String, Bundler<?>> mBundlers;

    public InjectionHelper(String baseKey, Map<String, Bundler<?>> bundlers) {
        mBaseKey = baseKey;
        mBundlers = bundlers;
    }

    @SuppressWarnings("unchecked")
    public <T> T getWithBundler(Bundle state, String key) {
        Bundler<T> b = (Bundler<T>) mBundlers.get(key);
        return b.get(key + mBaseKey, state);
    }

    @SuppressWarnings("unchecked")
    public <T> void putWithBundler(Bundle state, String key, T value) {
        if (value != null) {
            Bundler<T> b = (Bundler<T>) mBundlers.get(key);
            b.put(key + mBaseKey, value, state);
        }
    }

    public boolean getBoolean(Bundle state, String key) {
        return state.getBoolean(key + mBaseKey);
    }

    public void putBoolean(Bundle state, String key, boolean x) {
        state.putBoolean(key + mBaseKey, x);
    }

    public Boolean getBoxedBoolean(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getBoolean(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedBoolean(Bundle state, String key, Boolean x) {
        if (x != null) {
            state.putBoolean(key + mBaseKey, x);
        }
    }

    public boolean[] getBooleanArray(Bundle state, String key) {
        return state.getBooleanArray(key + mBaseKey);
    }

    public void putBooleanArray(Bundle state, String key, boolean[] x) {
        state.putBooleanArray(key + mBaseKey, x);
    }

    public byte getByte(Bundle state, String key) {
        return state.getByte(key + mBaseKey);
    }

    public void putByte(Bundle state, String key, byte x) {
        state.putByte(key + mBaseKey, x);
    }

    public Byte getBoxedByte(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getByte(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedByte(Bundle state, String key, Byte x) {
        if (x != null) {
            state.putByte(key + mBaseKey, x);
        }
    }

    public byte[] getByteArray(Bundle state, String key) {
        return state.getByteArray(key + mBaseKey);
    }

    public void putByteArray(Bundle state, String key, byte[] x) {
        state.putByteArray(key + mBaseKey, x);
    }


    public short getShort(Bundle state, String key) {
        return state.getShort(key + mBaseKey);
    }

    public void putShort(Bundle state, String key, short x) {
        state.putShort(key + mBaseKey, x);
    }

    public Short getBoxedShort(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getShort(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedShort(Bundle state, String key, Short x) {
        if (x != null) {
            state.putShort(key + mBaseKey, x);
        }
    }

    public short[] getShortArray(Bundle state, String key) {
        return state.getShortArray(key + mBaseKey);
    }

    public void putShortArray(Bundle state, String key, short[] x) {
        state.putShortArray(key + mBaseKey, x);
    }

    public int getInt(Bundle state, String key) {
        return state.getInt(key + mBaseKey);
    }

    public void putInt(Bundle state, String key, int x) {
        state.putInt(key + mBaseKey, x);
    }

    public Integer getBoxedInt(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getInt(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedInt(Bundle state, String key, Integer x) {
        if (x != null) {
            state.putInt(key + mBaseKey, x);
        }
    }

    public int[] getIntArray(Bundle state, String key) {
        return state.getIntArray(key + mBaseKey);
    }

    public void putIntArray(Bundle state, String key, int[] x) {
        state.putIntArray(key + mBaseKey, x);
    }

    public long getLong(Bundle state, String key) {
        return state.getLong(key + mBaseKey);
    }

    public void putLong(Bundle state, String key, long x) {
        state.putLong(key + mBaseKey, x);
    }

    public Long getBoxedLong(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getLong(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedLong(Bundle state, String key, Long x) {
        if (x != null) {
            state.putLong(key + mBaseKey, x);
        }
    }

    public long[] getLongArray(Bundle state, String key) {
        return state.getLongArray(key + mBaseKey);
    }

    public void putLongArray(Bundle state, String key, long[] x) {
        state.putLongArray(key + mBaseKey, x);
    }

    public float getFloat(Bundle state, String key) {
        return state.getFloat(key + mBaseKey);
    }

    public void putFloat(Bundle state, String key, float x) {
        state.putFloat(key + mBaseKey, x);
    }

    public Float getBoxedFloat(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getFloat(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedFloat(Bundle state, String key, Float x) {
        if (x != null) {
            state.putFloat(key + mBaseKey, x);
        }
    }

    public float[] getFloatArray(Bundle state, String key) {
        return state.getFloatArray(key + mBaseKey);
    }

    public void putFloatArray(Bundle state, String key, float[] x) {
        state.putFloatArray(key + mBaseKey, x);
    }

    public double getDouble(Bundle state, String key) {
        return state.getDouble(key + mBaseKey);
    }

    public void putDouble(Bundle state, String key, double x) {
        state.putDouble(key + mBaseKey, x);
    }

    public Double getBoxedDouble(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getDouble(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedDouble(Bundle state, String key, Double x) {
        if (x != null) {
            state.putDouble(key + mBaseKey, x);
        }
    }

    public double[] getDoubleArray(Bundle state, String key) {
        return state.getDoubleArray(key + mBaseKey);
    }

    public void putDoubleArray(Bundle state, String key, double[] x) {
        state.putDoubleArray(key + mBaseKey, x);
    }

    public char getChar(Bundle state, String key) {
        return state.getChar(key + mBaseKey);
    }

    public void putChar(Bundle state, String key, char x) {
        state.putChar(key + mBaseKey, x);
    }

    public Character getBoxedChar(Bundle state, String key) {
        if (state.containsKey(key + mBaseKey)) {
            return state.getChar(key + mBaseKey);
        }
        return null;
    }

    public void putBoxedChar(Bundle state, String key, Character x) {
        if (x != null) {
            state.putChar(key + mBaseKey, x);
        }
    }

    public char[] getCharArray(Bundle state, String key) {
        return state.getCharArray(key + mBaseKey);
    }

    public void putCharArray(Bundle state, String key, char[] x) {
        state.putCharArray(key + mBaseKey, x);
    }

    public String getString(Bundle state, String key) {
        return state.getString(key + mBaseKey);
    }

    public void putString(Bundle state, String key, String x) {
        state.putString(key + mBaseKey, x);
    }

    public String[] getStringArray(Bundle state, String key) {
        return state.getStringArray(key + mBaseKey);
    }

    public void putStringArray(Bundle state, String key, String[] x) {
        state.putStringArray(key + mBaseKey, x);
    }

    public CharSequence getCharSequence(Bundle state, String key) {
        return state.getCharSequence(key + mBaseKey);
    }

    public void putCharSequence(Bundle state, String key, CharSequence x) {
        state.putCharSequence(key + mBaseKey, x);
    }

    public CharSequence[] getCharSequenceArray(Bundle state, String key) {
        return state.getCharSequenceArray(key + mBaseKey);
    }

    public void putCharSequenceArray(Bundle state, String key, CharSequence[] x) {
        state.putCharSequenceArray(key + mBaseKey, x);
    }

    public Bundle getBundle(Bundle state, String key) {
        return state.getBundle(key + mBaseKey);
    }

    public void putBundle(Bundle state, String key, Bundle x) {
        state.putBundle(key + mBaseKey, x);
    }

    public <T extends Parcelable> T getParcelable(Bundle state, String key) {
        return state.getParcelable(key + mBaseKey);
    }

    public void putParcelable(Bundle state, String key, Parcelable x) {
        state.putParcelable(key + mBaseKey, x);
    }

    public Parcelable[] getParcelableArray(Bundle state, String key) {
        return state.getParcelableArray(key + mBaseKey);
    }

    public void putParcelableArray(Bundle state, String key, Parcelable[] x) {
        state.putParcelableArray(key + mBaseKey, x);
    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> T getSerializable(Bundle state, String key) {
        return (T) state.getSerializable(key + mBaseKey);
    }

    public void putSerializable(Bundle state, String key, Serializable x) {
        state.putSerializable(key + mBaseKey, x);
    }

    public ArrayList<Integer> getIntegerArrayList(Bundle state, String key) {
        return state.getIntegerArrayList(key + mBaseKey);
    }

    public void putIntegerArrayList(Bundle state, String key, ArrayList<Integer> x) {
        state.putIntegerArrayList(key + mBaseKey, x);
    }

    public ArrayList<String> getStringArrayList(Bundle state, String key) {
        return state.getStringArrayList(key + mBaseKey);
    }

    public void putStringArrayList(Bundle state, String key, ArrayList<String> x) {
        state.putStringArrayList(key + mBaseKey, x);
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(Bundle state, String key) {
        return state.getCharSequenceArrayList(key + mBaseKey);
    }

    public void putCharSequenceArrayList(Bundle state, String key, ArrayList<CharSequence> x) {
        state.putCharSequenceArrayList(key + mBaseKey, x);
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(Bundle state, String key) {
        return state.getParcelableArrayList(key + mBaseKey);
    }

    public void putParcelableArrayList(Bundle state, String key, ArrayList<? extends Parcelable> x) {
        state.putParcelableArrayList(key + mBaseKey, x);
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(Bundle state, String key) {
        return state.getSparseParcelableArray(key + mBaseKey);
    }

    public void putSparseParcelableArray(Bundle state, String key, SparseArray<? extends Parcelable> x) {
        state.putSparseParcelableArray(key + mBaseKey, x);
    }

    public Parcelable getParent(Bundle state) {
        return state.getParcelable(mBaseKey + "$$SUPER");
    }

    public Bundle putParent(@Nullable Parcelable superState) {
        Bundle state = new Bundle();
        if (superState != null) {
            state.putParcelable(mBaseKey + "$$SUPER", superState);
        }
        return state;
    }

}
