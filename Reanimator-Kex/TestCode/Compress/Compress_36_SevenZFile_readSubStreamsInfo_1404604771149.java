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

public class SevenZFile_readSubStreamsInfo_1404604771149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62646;
     Object term62756;

    public SevenZFile_readSubStreamsInfo_1404604771149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62646 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term62756 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term61572 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 158);
        Object term62864 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term62864, term62864.getClass(), "numUnpackSubStreams", 0);
        setElement(term61572, 0, term62864);
        setElement(term61572, 1, term62864);
        setElement(term61572, 2, term62864);
        setElement(term61572, 3, term62864);
        setElement(term61572, 4, term62864);
        setElement(term61572, 5, term62864);
        setElement(term61572, 6, term62864);
        setElement(term61572, 7, term62864);
        setElement(term61572, 8, term62864);
        setElement(term61572, 9, term62864);
        setElement(term61572, 10, term62864);
        setElement(term61572, 11, term62864);
        setElement(term61572, 12, term62864);
        setElement(term61572, 13, term62864);
        setElement(term61572, 14, term62864);
        setElement(term61572, 15, term62864);
        setElement(term61572, 16, term62864);
        setElement(term61572, 17, term62864);
        setElement(term61572, 18, term62864);
        setElement(term61572, 19, term62864);
        setElement(term61572, 20, term62864);
        setElement(term61572, 21, term62864);
        setElement(term61572, 22, term62864);
        setElement(term61572, 23, term62864);
        setElement(term61572, 24, term62864);
        setElement(term61572, 25, term62864);
        setElement(term61572, 26, term62864);
        setElement(term61572, 27, term62864);
        setElement(term61572, 28, term62864);
        setElement(term61572, 29, term62864);
        setElement(term61572, 30, term62864);
        setElement(term61572, 31, term62864);
        setElement(term61572, 32, term62864);
        setElement(term61572, 33, term62864);
        setElement(term61572, 34, term62864);
        setElement(term61572, 35, term62864);
        setElement(term61572, 36, term62864);
        setElement(term61572, 37, term62864);
        setElement(term61572, 38, term62864);
        setElement(term61572, 39, term62864);
        setElement(term61572, 40, term62864);
        setElement(term61572, 41, term62864);
        setElement(term61572, 42, term62864);
        setElement(term61572, 43, term62864);
        setElement(term61572, 44, term62864);
        setElement(term61572, 45, term62864);
        setElement(term61572, 46, term62864);
        setElement(term61572, 47, term62864);
        setElement(term61572, 48, term62864);
        setElement(term61572, 49, term62864);
        setElement(term61572, 50, term62864);
        setElement(term61572, 51, term62864);
        setElement(term61572, 52, term62864);
        setElement(term61572, 53, term62864);
        setElement(term61572, 54, term62864);
        setElement(term61572, 55, term62864);
        setElement(term61572, 56, term62864);
        setElement(term61572, 57, term62864);
        setElement(term61572, 58, term62864);
        setElement(term61572, 59, term62864);
        setElement(term61572, 60, term62864);
        setElement(term61572, 61, term62864);
        setElement(term61572, 62, term62864);
        setElement(term61572, 63, term62864);
        setElement(term61572, 64, term62864);
        setElement(term61572, 65, term62864);
        setElement(term61572, 66, term62864);
        setElement(term61572, 67, term62864);
        setElement(term61572, 68, term62864);
        setElement(term61572, 69, term62864);
        setElement(term61572, 70, term62864);
        setElement(term61572, 71, term62864);
        setElement(term61572, 72, term62864);
        setElement(term61572, 73, term62864);
        setElement(term61572, 74, term62864);
        setElement(term61572, 75, term62864);
        setElement(term61572, 76, term62864);
        setElement(term61572, 77, term62864);
        setElement(term61572, 78, term62864);
        setElement(term61572, 79, term62864);
        setElement(term61572, 80, term62864);
        setElement(term61572, 81, term62864);
        setElement(term61572, 82, term62864);
        setElement(term61572, 83, term62864);
        setElement(term61572, 84, term62864);
        setElement(term61572, 85, term62864);
        setElement(term61572, 86, term62864);
        setElement(term61572, 87, term62864);
        setElement(term61572, 88, term62864);
        setElement(term61572, 89, term62864);
        setElement(term61572, 90, term62864);
        setElement(term61572, 91, term62864);
        setElement(term61572, 92, term62864);
        setElement(term61572, 93, term62864);
        setElement(term61572, 94, term62864);
        setElement(term61572, 95, term62864);
        setElement(term61572, 96, term62864);
        setElement(term61572, 97, term62864);
        setElement(term61572, 98, term62864);
        setElement(term61572, 99, term62864);
        setElement(term61572, 100, term62864);
        setElement(term61572, 101, term62864);
        setElement(term61572, 102, term62864);
        setElement(term61572, 103, term62864);
        setElement(term61572, 104, term62864);
        setElement(term61572, 105, term62864);
        setElement(term61572, 106, term62864);
        setElement(term61572, 107, term62864);
        setElement(term61572, 108, term62864);
        setElement(term61572, 109, term62864);
        setElement(term61572, 110, term62864);
        setElement(term61572, 111, term62864);
        setElement(term61572, 112, term62864);
        setElement(term61572, 113, term62864);
        setElement(term61572, 114, term62864);
        setElement(term61572, 115, term62864);
        setElement(term61572, 116, term62864);
        setElement(term61572, 117, term62864);
        setElement(term61572, 118, term62864);
        setElement(term61572, 119, term62864);
        setElement(term61572, 120, term62864);
        setElement(term61572, 121, term62864);
        setElement(term61572, 122, term62864);
        setElement(term61572, 123, term62864);
        setElement(term61572, 124, term62864);
        setElement(term61572, 125, term62864);
        setElement(term61572, 126, term62864);
        setElement(term61572, 127, term62864);
        setElement(term61572, 128, term62864);
        setElement(term61572, 129, term62864);
        setElement(term61572, 130, term62864);
        setElement(term61572, 131, term62864);
        setElement(term61572, 132, term62864);
        setElement(term61572, 133, term62864);
        setElement(term61572, 134, term62864);
        setElement(term61572, 135, term62864);
        setElement(term61572, 136, term62864);
        setElement(term61572, 137, term62864);
        setElement(term61572, 138, term62864);
        setElement(term61572, 139, term62864);
        setElement(term61572, 140, term62864);
        setElement(term61572, 141, term62864);
        setElement(term61572, 142, term62864);
        setElement(term61572, 143, term62864);
        setElement(term61572, 144, term62864);
        setElement(term61572, 145, term62864);
        setElement(term61572, 146, term62864);
        setElement(term61572, 147, term62864);
        setElement(term61572, 148, term62864);
        setElement(term61572, 149, term62864);
        setElement(term61572, 150, term62864);
        setElement(term61572, 151, term62864);
        setElement(term61572, 152, term62864);
        setElement(term61572, 153, term62864);
        setElement(term61572, 154, term62864);
        setElement(term61572, 155, term62864);
        setElement(term61572, 156, term62864);
        setElement(term61572, 157, term62864);
        setField(term62756, term62756.getClass(), "folders", term61572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62756;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term62646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


