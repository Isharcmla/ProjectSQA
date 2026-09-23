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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SevenZFile_readSubStreamsInfo_1404604771137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54119;
     Object term54229;

    public SevenZFile_readSubStreamsInfo_1404604771137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54119 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term54229 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term53512 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 80);
        Object term54337 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object term54445 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term54337, term54337.getClass(), "numUnpackSubStreams", 0);
        setElement(term53512, 0, term54337);
        setElement(term53512, 1, term54337);
        setElement(term53512, 2, term54337);
        setElement(term53512, 3, term54337);
        setElement(term53512, 4, term54337);
        setElement(term53512, 5, term54337);
        setElement(term53512, 6, term54337);
        setElement(term53512, 7, term54337);
        setElement(term53512, 8, term54337);
        setElement(term53512, 9, term54337);
        setElement(term53512, 10, term54337);
        setElement(term53512, 11, term54337);
        setElement(term53512, 12, term54337);
        setElement(term53512, 13, term54337);
        setElement(term53512, 14, term54337);
        setElement(term53512, 15, term54337);
        setElement(term53512, 16, term54337);
        setElement(term53512, 17, term54337);
        setElement(term53512, 18, term54337);
        setElement(term53512, 19, term54337);
        setElement(term53512, 20, term54337);
        setElement(term53512, 21, term54337);
        setElement(term53512, 22, term54337);
        setElement(term53512, 23, term54337);
        setElement(term53512, 24, term54337);
        setElement(term53512, 25, term54337);
        setIntField(term54445, term54445.getClass(), "numUnpackSubStreams", 0);
        setElement(term53512, 26, term54445);
        setElement(term53512, 27, term54337);
        setElement(term53512, 28, term54337);
        setElement(term53512, 29, term54337);
        setElement(term53512, 30, term54337);
        setElement(term53512, 31, term54337);
        setElement(term53512, 32, term54337);
        setElement(term53512, 33, term54337);
        setElement(term53512, 34, term54337);
        setElement(term53512, 35, term54337);
        setElement(term53512, 36, term54337);
        setElement(term53512, 37, term54337);
        setElement(term53512, 38, term54337);
        setElement(term53512, 39, term54337);
        setElement(term53512, 40, term54337);
        setElement(term53512, 41, term54337);
        setElement(term53512, 42, term54337);
        setElement(term53512, 43, term54337);
        setElement(term53512, 44, term54337);
        setElement(term53512, 45, term54337);
        setElement(term53512, 46, term54337);
        setElement(term53512, 47, term54337);
        setElement(term53512, 48, term54337);
        setElement(term53512, 49, term54337);
        setElement(term53512, 50, term54337);
        setElement(term53512, 51, term54337);
        setElement(term53512, 52, term54337);
        setElement(term53512, 53, term54337);
        setElement(term53512, 54, term54337);
        setElement(term53512, 55, term54337);
        setElement(term53512, 56, term54337);
        setElement(term53512, 57, term54337);
        setElement(term53512, 58, term54337);
        setElement(term53512, 59, term54337);
        setElement(term53512, 60, term54337);
        setElement(term53512, 61, term54337);
        setElement(term53512, 62, term54337);
        setElement(term53512, 63, term54337);
        setElement(term53512, 64, term54337);
        setElement(term53512, 65, term54337);
        setElement(term53512, 66, term54337);
        setElement(term53512, 67, term54337);
        setElement(term53512, 68, term54337);
        setElement(term53512, 69, term54337);
        setElement(term53512, 70, term54337);
        setElement(term53512, 71, term54337);
        setElement(term53512, 72, term54337);
        setElement(term53512, 73, term54337);
        setElement(term53512, 74, term54337);
        setElement(term53512, 75, term54337);
        setElement(term53512, 76, term54337);
        setElement(term53512, 77, term54337);
        setElement(term53512, 78, term54337);
        setElement(term53512, 79, term54337);
        setField(term54229, term54229.getClass(), "folders", term53512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54229;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term54119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


