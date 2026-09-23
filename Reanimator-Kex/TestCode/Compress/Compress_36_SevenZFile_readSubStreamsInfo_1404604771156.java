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

public class SevenZFile_readSubStreamsInfo_1404604771156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67155;
     Object term67265;

    public SevenZFile_readSubStreamsInfo_1404604771156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67155 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term67265 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term66045 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 164);
        Object term67373 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term67373, term67373.getClass(), "numUnpackSubStreams", 0);
        setElement(term66045, 0, term67373);
        setElement(term66045, 1, term67373);
        setElement(term66045, 2, term67373);
        setElement(term66045, 3, term67373);
        setElement(term66045, 4, term67373);
        setElement(term66045, 5, term67373);
        setElement(term66045, 6, term67373);
        setElement(term66045, 7, term67373);
        setElement(term66045, 8, term67373);
        setElement(term66045, 9, term67373);
        setElement(term66045, 10, term67373);
        setElement(term66045, 11, term67373);
        setElement(term66045, 12, term67373);
        setElement(term66045, 13, term67373);
        setElement(term66045, 14, term67373);
        setElement(term66045, 15, term67373);
        setElement(term66045, 16, term67373);
        setElement(term66045, 17, term67373);
        setElement(term66045, 18, term67373);
        setElement(term66045, 19, term67373);
        setElement(term66045, 20, term67373);
        setElement(term66045, 21, term67373);
        setElement(term66045, 22, term67373);
        setElement(term66045, 23, term67373);
        setElement(term66045, 24, term67373);
        setElement(term66045, 25, term67373);
        setElement(term66045, 26, term67373);
        setElement(term66045, 27, term67373);
        setElement(term66045, 28, term67373);
        setElement(term66045, 29, term67373);
        setElement(term66045, 30, term67373);
        setElement(term66045, 31, term67373);
        setElement(term66045, 32, term67373);
        setElement(term66045, 33, term67373);
        setElement(term66045, 34, term67373);
        setElement(term66045, 35, term67373);
        setElement(term66045, 36, term67373);
        setElement(term66045, 37, term67373);
        setElement(term66045, 38, term67373);
        setElement(term66045, 39, term67373);
        setElement(term66045, 40, term67373);
        setElement(term66045, 41, term67373);
        setElement(term66045, 42, term67373);
        setElement(term66045, 43, term67373);
        setElement(term66045, 44, term67373);
        setElement(term66045, 45, term67373);
        setElement(term66045, 46, term67373);
        setElement(term66045, 47, term67373);
        setElement(term66045, 48, term67373);
        setElement(term66045, 49, term67373);
        setElement(term66045, 50, term67373);
        setElement(term66045, 51, term67373);
        setElement(term66045, 52, term67373);
        setElement(term66045, 53, term67373);
        setElement(term66045, 54, term67373);
        setElement(term66045, 55, term67373);
        setElement(term66045, 56, term67373);
        setElement(term66045, 57, term67373);
        setElement(term66045, 58, term67373);
        setElement(term66045, 59, term67373);
        setElement(term66045, 60, term67373);
        setElement(term66045, 61, term67373);
        setElement(term66045, 62, term67373);
        setElement(term66045, 63, term67373);
        setElement(term66045, 64, term67373);
        setElement(term66045, 65, term67373);
        setElement(term66045, 66, term67373);
        setElement(term66045, 67, term67373);
        setElement(term66045, 68, term67373);
        setElement(term66045, 69, term67373);
        setElement(term66045, 70, term67373);
        setElement(term66045, 71, term67373);
        setElement(term66045, 72, term67373);
        setElement(term66045, 73, term67373);
        setElement(term66045, 74, term67373);
        setElement(term66045, 75, term67373);
        setElement(term66045, 76, term67373);
        setElement(term66045, 77, term67373);
        setElement(term66045, 78, term67373);
        setElement(term66045, 79, term67373);
        setElement(term66045, 80, term67373);
        setElement(term66045, 81, term67373);
        setElement(term66045, 82, term67373);
        setElement(term66045, 83, term67373);
        setElement(term66045, 84, term67373);
        setElement(term66045, 85, term67373);
        setElement(term66045, 86, term67373);
        setElement(term66045, 87, term67373);
        setElement(term66045, 88, term67373);
        setElement(term66045, 89, term67373);
        setElement(term66045, 90, term67373);
        setElement(term66045, 91, term67373);
        setElement(term66045, 92, term67373);
        setElement(term66045, 93, term67373);
        setElement(term66045, 94, term67373);
        setElement(term66045, 95, term67373);
        setElement(term66045, 96, term67373);
        setElement(term66045, 97, term67373);
        setElement(term66045, 98, term67373);
        setElement(term66045, 99, term67373);
        setElement(term66045, 100, term67373);
        setElement(term66045, 101, term67373);
        setElement(term66045, 102, term67373);
        setElement(term66045, 103, term67373);
        setElement(term66045, 104, term67373);
        setElement(term66045, 105, term67373);
        setElement(term66045, 106, term67373);
        setElement(term66045, 107, term67373);
        setElement(term66045, 108, term67373);
        setElement(term66045, 109, term67373);
        setElement(term66045, 110, term67373);
        setElement(term66045, 111, term67373);
        setElement(term66045, 112, term67373);
        setElement(term66045, 113, term67373);
        setElement(term66045, 114, term67373);
        setElement(term66045, 115, term67373);
        setElement(term66045, 116, term67373);
        setElement(term66045, 117, term67373);
        setElement(term66045, 118, term67373);
        setElement(term66045, 119, term67373);
        setElement(term66045, 120, term67373);
        setElement(term66045, 121, term67373);
        setElement(term66045, 122, term67373);
        setElement(term66045, 123, term67373);
        setElement(term66045, 124, term67373);
        setElement(term66045, 125, term67373);
        setElement(term66045, 126, term67373);
        setElement(term66045, 127, term67373);
        setElement(term66045, 128, term67373);
        setElement(term66045, 129, term67373);
        setElement(term66045, 130, term67373);
        setElement(term66045, 131, term67373);
        setElement(term66045, 132, term67373);
        setElement(term66045, 133, term67373);
        setElement(term66045, 134, term67373);
        setElement(term66045, 135, term67373);
        setElement(term66045, 136, term67373);
        setElement(term66045, 137, term67373);
        setElement(term66045, 138, term67373);
        setElement(term66045, 139, term67373);
        setElement(term66045, 140, term67373);
        setElement(term66045, 141, term67373);
        setElement(term66045, 142, term67373);
        setElement(term66045, 143, term67373);
        setElement(term66045, 144, term67373);
        setElement(term66045, 145, term67373);
        setElement(term66045, 146, term67373);
        setElement(term66045, 147, term67373);
        setElement(term66045, 148, term67373);
        setElement(term66045, 149, term67373);
        setElement(term66045, 150, term67373);
        setElement(term66045, 151, term67373);
        setElement(term66045, 152, term67373);
        setElement(term66045, 153, term67373);
        setElement(term66045, 154, term67373);
        setElement(term66045, 155, term67373);
        setElement(term66045, 156, term67373);
        setElement(term66045, 157, term67373);
        setElement(term66045, 158, term67373);
        setElement(term66045, 159, term67373);
        setElement(term66045, 160, term67373);
        setElement(term66045, 161, term67373);
        setElement(term66045, 162, term67373);
        setElement(term66045, 163, term67373);
        setField(term67265, term67265.getClass(), "folders", term66045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term67265;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term67155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


