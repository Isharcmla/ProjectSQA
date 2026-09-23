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

public class SevenZFile_readSubStreamsInfo_1404604771139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55791;
     Object term55901;

    public SevenZFile_readSubStreamsInfo_1404604771139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55791 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term55901 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term54777 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 148);
        Object term56009 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term56009, term56009.getClass(), "numUnpackSubStreams", 0);
        setElement(term54777, 0, term56009);
        setElement(term54777, 1, term56009);
        setElement(term54777, 2, term56009);
        setElement(term54777, 3, term56009);
        setElement(term54777, 4, term56009);
        setElement(term54777, 5, term56009);
        setElement(term54777, 6, term56009);
        setElement(term54777, 7, term56009);
        setElement(term54777, 8, term56009);
        setElement(term54777, 9, term56009);
        setElement(term54777, 10, term56009);
        setElement(term54777, 11, term56009);
        setElement(term54777, 12, term56009);
        setElement(term54777, 13, term56009);
        setElement(term54777, 14, term56009);
        setElement(term54777, 15, term56009);
        setElement(term54777, 16, term56009);
        setElement(term54777, 17, term56009);
        setElement(term54777, 18, term56009);
        setElement(term54777, 19, term56009);
        setElement(term54777, 20, term56009);
        setElement(term54777, 21, term56009);
        setElement(term54777, 22, term56009);
        setElement(term54777, 23, term56009);
        setElement(term54777, 24, term56009);
        setElement(term54777, 25, term56009);
        setElement(term54777, 26, term56009);
        setElement(term54777, 27, term56009);
        setElement(term54777, 28, term56009);
        setElement(term54777, 29, term56009);
        setElement(term54777, 30, term56009);
        setElement(term54777, 31, term56009);
        setElement(term54777, 32, term56009);
        setElement(term54777, 33, term56009);
        setElement(term54777, 34, term56009);
        setElement(term54777, 35, term56009);
        setElement(term54777, 36, term56009);
        setElement(term54777, 37, term56009);
        setElement(term54777, 38, term56009);
        setElement(term54777, 39, term56009);
        setElement(term54777, 40, term56009);
        setElement(term54777, 41, term56009);
        setElement(term54777, 42, term56009);
        setElement(term54777, 43, term56009);
        setElement(term54777, 44, term56009);
        setElement(term54777, 45, term56009);
        setElement(term54777, 46, term56009);
        setElement(term54777, 47, term56009);
        setElement(term54777, 48, term56009);
        setElement(term54777, 49, term56009);
        setElement(term54777, 50, term56009);
        setElement(term54777, 51, term56009);
        setElement(term54777, 52, term56009);
        setElement(term54777, 53, term56009);
        setElement(term54777, 54, term56009);
        setElement(term54777, 55, term56009);
        setElement(term54777, 56, term56009);
        setElement(term54777, 57, term56009);
        setElement(term54777, 58, term56009);
        setElement(term54777, 59, term56009);
        setElement(term54777, 60, term56009);
        setElement(term54777, 61, term56009);
        setElement(term54777, 62, term56009);
        setElement(term54777, 63, term56009);
        setElement(term54777, 64, term56009);
        setElement(term54777, 65, term56009);
        setElement(term54777, 66, term56009);
        setElement(term54777, 67, term56009);
        setElement(term54777, 68, term56009);
        setElement(term54777, 69, term56009);
        setElement(term54777, 70, term56009);
        setElement(term54777, 71, term56009);
        setElement(term54777, 72, term56009);
        setElement(term54777, 73, term56009);
        setElement(term54777, 74, term56009);
        setElement(term54777, 75, term56009);
        setElement(term54777, 76, term56009);
        setElement(term54777, 77, term56009);
        setElement(term54777, 78, term56009);
        setElement(term54777, 79, term56009);
        setElement(term54777, 80, term56009);
        setElement(term54777, 81, term56009);
        setElement(term54777, 82, term56009);
        setElement(term54777, 83, term56009);
        setElement(term54777, 84, term56009);
        setElement(term54777, 85, term56009);
        setElement(term54777, 86, term56009);
        setElement(term54777, 87, term56009);
        setElement(term54777, 88, term56009);
        setElement(term54777, 89, term56009);
        setElement(term54777, 90, term56009);
        setElement(term54777, 91, term56009);
        setElement(term54777, 92, term56009);
        setElement(term54777, 93, term56009);
        setElement(term54777, 94, term56009);
        setElement(term54777, 95, term56009);
        setElement(term54777, 96, term56009);
        setElement(term54777, 97, term56009);
        setElement(term54777, 98, term56009);
        setElement(term54777, 99, term56009);
        setElement(term54777, 100, term56009);
        setElement(term54777, 101, term56009);
        setElement(term54777, 102, term56009);
        setElement(term54777, 103, term56009);
        setElement(term54777, 104, term56009);
        setElement(term54777, 105, term56009);
        setElement(term54777, 106, term56009);
        setElement(term54777, 107, term56009);
        setElement(term54777, 108, term56009);
        setElement(term54777, 109, term56009);
        setElement(term54777, 110, term56009);
        setElement(term54777, 111, term56009);
        setElement(term54777, 112, term56009);
        setElement(term54777, 113, term56009);
        setElement(term54777, 114, term56009);
        setElement(term54777, 115, term56009);
        setElement(term54777, 116, term56009);
        setElement(term54777, 117, term56009);
        setElement(term54777, 118, term56009);
        setElement(term54777, 119, term56009);
        setElement(term54777, 120, term56009);
        setElement(term54777, 121, term56009);
        setElement(term54777, 122, term56009);
        setElement(term54777, 123, term56009);
        setElement(term54777, 124, term56009);
        setElement(term54777, 125, term56009);
        setElement(term54777, 126, term56009);
        setElement(term54777, 127, term56009);
        setElement(term54777, 128, term56009);
        setElement(term54777, 129, term56009);
        setElement(term54777, 130, term56009);
        setElement(term54777, 131, term56009);
        setElement(term54777, 132, term56009);
        setElement(term54777, 133, term56009);
        setElement(term54777, 134, term56009);
        setElement(term54777, 135, term56009);
        setElement(term54777, 136, term56009);
        setElement(term54777, 137, term56009);
        setElement(term54777, 138, term56009);
        setElement(term54777, 139, term56009);
        setElement(term54777, 140, term56009);
        setElement(term54777, 141, term56009);
        setElement(term54777, 142, term56009);
        setElement(term54777, 143, term56009);
        setElement(term54777, 144, term56009);
        setElement(term54777, 145, term56009);
        setElement(term54777, 146, term56009);
        setElement(term54777, 147, term56009);
        setField(term55901, term55901.getClass(), "folders", term54777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55901;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term55791, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


