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

public class SevenZFile_readSubStreamsInfo_1404604771141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57399;
     Object term57509;

    public SevenZFile_readSubStreamsInfo_1404604771141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57399 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term57509 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term56409 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 144);
        Object term57617 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term57617, term57617.getClass(), "numUnpackSubStreams", 0);
        setElement(term56409, 0, term57617);
        setElement(term56409, 1, term57617);
        setElement(term56409, 2, term57617);
        setElement(term56409, 3, term57617);
        setElement(term56409, 4, term57617);
        setElement(term56409, 5, term57617);
        setElement(term56409, 6, term57617);
        setElement(term56409, 7, term57617);
        setElement(term56409, 8, term57617);
        setElement(term56409, 9, term57617);
        setElement(term56409, 10, term57617);
        setElement(term56409, 11, term57617);
        setElement(term56409, 12, term57617);
        setElement(term56409, 13, term57617);
        setElement(term56409, 14, term57617);
        setElement(term56409, 15, term57617);
        setElement(term56409, 16, term57617);
        setElement(term56409, 17, term57617);
        setElement(term56409, 18, term57617);
        setElement(term56409, 19, term57617);
        setElement(term56409, 20, term57617);
        setElement(term56409, 21, term57617);
        setElement(term56409, 22, term57617);
        setElement(term56409, 23, term57617);
        setElement(term56409, 24, term57617);
        setElement(term56409, 25, term57617);
        setElement(term56409, 26, term57617);
        setElement(term56409, 27, term57617);
        setElement(term56409, 28, term57617);
        setElement(term56409, 29, term57617);
        setElement(term56409, 30, term57617);
        setElement(term56409, 31, term57617);
        setElement(term56409, 32, term57617);
        setElement(term56409, 33, term57617);
        setElement(term56409, 34, term57617);
        setElement(term56409, 35, term57617);
        setElement(term56409, 36, term57617);
        setElement(term56409, 37, term57617);
        setElement(term56409, 38, term57617);
        setElement(term56409, 39, term57617);
        setElement(term56409, 40, term57617);
        setElement(term56409, 41, term57617);
        setElement(term56409, 42, term57617);
        setElement(term56409, 43, term57617);
        setElement(term56409, 44, term57617);
        setElement(term56409, 45, term57617);
        setElement(term56409, 46, term57617);
        setElement(term56409, 47, term57617);
        setElement(term56409, 48, term57617);
        setElement(term56409, 49, term57617);
        setElement(term56409, 50, term57617);
        setElement(term56409, 51, term57617);
        setElement(term56409, 52, term57617);
        setElement(term56409, 53, term57617);
        setElement(term56409, 54, term57617);
        setElement(term56409, 55, term57617);
        setElement(term56409, 56, term57617);
        setElement(term56409, 57, term57617);
        setElement(term56409, 58, term57617);
        setElement(term56409, 59, term57617);
        setElement(term56409, 60, term57617);
        setElement(term56409, 61, term57617);
        setElement(term56409, 62, term57617);
        setElement(term56409, 63, term57617);
        setElement(term56409, 64, term57617);
        setElement(term56409, 65, term57617);
        setElement(term56409, 66, term57617);
        setElement(term56409, 67, term57617);
        setElement(term56409, 68, term57617);
        setElement(term56409, 69, term57617);
        setElement(term56409, 70, term57617);
        setElement(term56409, 71, term57617);
        setElement(term56409, 72, term57617);
        setElement(term56409, 73, term57617);
        setElement(term56409, 74, term57617);
        setElement(term56409, 75, term57617);
        setElement(term56409, 76, term57617);
        setElement(term56409, 77, term57617);
        setElement(term56409, 78, term57617);
        setElement(term56409, 79, term57617);
        setElement(term56409, 80, term57617);
        setElement(term56409, 81, term57617);
        setElement(term56409, 82, term57617);
        setElement(term56409, 83, term57617);
        setElement(term56409, 84, term57617);
        setElement(term56409, 85, term57617);
        setElement(term56409, 86, term57617);
        setElement(term56409, 87, term57617);
        setElement(term56409, 88, term57617);
        setElement(term56409, 89, term57617);
        setElement(term56409, 90, term57617);
        setElement(term56409, 91, term57617);
        setElement(term56409, 92, term57617);
        setElement(term56409, 93, term57617);
        setElement(term56409, 94, term57617);
        setElement(term56409, 95, term57617);
        setElement(term56409, 96, term57617);
        setElement(term56409, 97, term57617);
        setElement(term56409, 98, term57617);
        setElement(term56409, 99, term57617);
        setElement(term56409, 100, term57617);
        setElement(term56409, 101, term57617);
        setElement(term56409, 102, term57617);
        setElement(term56409, 103, term57617);
        setElement(term56409, 104, term57617);
        setElement(term56409, 105, term57617);
        setElement(term56409, 106, term57617);
        setElement(term56409, 107, term57617);
        setElement(term56409, 108, term57617);
        setElement(term56409, 109, term57617);
        setElement(term56409, 110, term57617);
        setElement(term56409, 111, term57617);
        setElement(term56409, 112, term57617);
        setElement(term56409, 113, term57617);
        setElement(term56409, 114, term57617);
        setElement(term56409, 115, term57617);
        setElement(term56409, 116, term57617);
        setElement(term56409, 117, term57617);
        setElement(term56409, 118, term57617);
        setElement(term56409, 119, term57617);
        setElement(term56409, 120, term57617);
        setElement(term56409, 121, term57617);
        setElement(term56409, 122, term57617);
        setElement(term56409, 123, term57617);
        setElement(term56409, 124, term57617);
        setElement(term56409, 125, term57617);
        setElement(term56409, 126, term57617);
        setElement(term56409, 127, term57617);
        setElement(term56409, 128, term57617);
        setElement(term56409, 129, term57617);
        setElement(term56409, 130, term57617);
        setElement(term56409, 131, term57617);
        setElement(term56409, 132, term57617);
        setElement(term56409, 133, term57617);
        setElement(term56409, 134, term57617);
        setElement(term56409, 135, term57617);
        setElement(term56409, 136, term57617);
        setElement(term56409, 137, term57617);
        setElement(term56409, 138, term57617);
        setElement(term56409, 139, term57617);
        setElement(term56409, 140, term57617);
        setElement(term56409, 141, term57617);
        setElement(term56409, 142, term57617);
        setElement(term56409, 143, term57617);
        setField(term57509, term57509.getClass(), "folders", term56409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57509;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term57399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


