package org.apache.commons.compress.archivers.sevenz;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SevenZFile_buildDecodingStream_97012121994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33613;

    public SevenZFile_buildDecodingStream_97012121994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33613 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term33723 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object term33837 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.StreamMap"));
        int[] term33481 = (int[]) newIntArray(0);
        setField(term33837, term33837.getClass(), "fileFolderIndex", term33481);
        setField(term33723, term33723.getClass(), "streamMap", term33837);
        setField(term33613, term33613.getClass(), "archive", term33723);
        setIntField(term33613, term33613.getClass(), "currentEntryIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildDecodingStream", argTypes, term33613, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


