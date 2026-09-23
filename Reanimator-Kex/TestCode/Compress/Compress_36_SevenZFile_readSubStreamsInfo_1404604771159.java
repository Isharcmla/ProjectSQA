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

public class SevenZFile_readSubStreamsInfo_1404604771159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69401;
     Object term69511;

    public SevenZFile_readSubStreamsInfo_1404604771159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69401 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term69511 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term68627 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 108);
        Object term69619 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term69619, term69619.getClass(), "numUnpackSubStreams", 0);
        setElement(term68627, 0, term69619);
        setElement(term68627, 1, term69619);
        setElement(term68627, 2, term69619);
        setElement(term68627, 3, term69619);
        setElement(term68627, 4, term69619);
        setElement(term68627, 5, term69619);
        setElement(term68627, 6, term69619);
        setElement(term68627, 7, term69619);
        setElement(term68627, 8, term69619);
        setElement(term68627, 9, term69619);
        setElement(term68627, 10, term69619);
        setElement(term68627, 11, term69619);
        setElement(term68627, 12, term69619);
        setElement(term68627, 13, term69619);
        setElement(term68627, 14, term69619);
        setElement(term68627, 15, term69619);
        setElement(term68627, 16, term69619);
        setElement(term68627, 17, term69619);
        setElement(term68627, 18, term69619);
        setElement(term68627, 19, term69619);
        setElement(term68627, 20, term69619);
        setElement(term68627, 21, term69619);
        setElement(term68627, 22, term69619);
        setElement(term68627, 23, term69619);
        setElement(term68627, 24, term69619);
        setElement(term68627, 25, term69619);
        setElement(term68627, 26, term69619);
        setElement(term68627, 27, term69619);
        setElement(term68627, 28, term69619);
        setElement(term68627, 29, term69619);
        setElement(term68627, 30, term69619);
        setElement(term68627, 31, term69619);
        setElement(term68627, 32, term69619);
        setElement(term68627, 33, term69619);
        setElement(term68627, 34, term69619);
        setElement(term68627, 35, term69619);
        setElement(term68627, 36, term69619);
        setElement(term68627, 37, term69619);
        setElement(term68627, 38, term69619);
        setElement(term68627, 39, term69619);
        setElement(term68627, 40, term69619);
        setElement(term68627, 41, term69619);
        setElement(term68627, 42, term69619);
        setElement(term68627, 43, term69619);
        setElement(term68627, 44, term69619);
        setElement(term68627, 45, term69619);
        setElement(term68627, 46, term69619);
        setElement(term68627, 47, term69619);
        setElement(term68627, 48, term69619);
        setElement(term68627, 49, term69619);
        setElement(term68627, 50, term69619);
        setElement(term68627, 51, term69619);
        setElement(term68627, 52, term69619);
        setElement(term68627, 53, term69619);
        setElement(term68627, 54, term69619);
        setElement(term68627, 55, term69619);
        setElement(term68627, 56, term69619);
        setElement(term68627, 57, term69619);
        setElement(term68627, 58, term69619);
        setElement(term68627, 59, term69619);
        setElement(term68627, 60, term69619);
        setElement(term68627, 61, term69619);
        setElement(term68627, 62, term69619);
        setElement(term68627, 63, term69619);
        setElement(term68627, 64, term69619);
        setElement(term68627, 65, term69619);
        setElement(term68627, 66, term69619);
        setElement(term68627, 67, term69619);
        setElement(term68627, 68, term69619);
        setElement(term68627, 69, term69619);
        setElement(term68627, 70, term69619);
        setElement(term68627, 71, term69619);
        setElement(term68627, 72, term69619);
        setElement(term68627, 73, term69619);
        setElement(term68627, 74, term69619);
        setElement(term68627, 75, term69619);
        setElement(term68627, 76, term69619);
        setElement(term68627, 77, term69619);
        setElement(term68627, 78, term69619);
        setElement(term68627, 79, term69619);
        setElement(term68627, 80, term69619);
        setElement(term68627, 81, term69619);
        setElement(term68627, 82, term69619);
        setElement(term68627, 83, term69619);
        setElement(term68627, 84, term69619);
        setElement(term68627, 85, term69619);
        setElement(term68627, 86, term69619);
        setElement(term68627, 87, term69619);
        setElement(term68627, 88, term69619);
        setElement(term68627, 89, term69619);
        setElement(term68627, 90, term69619);
        setElement(term68627, 91, term69619);
        setElement(term68627, 92, term69619);
        setElement(term68627, 93, term69619);
        setElement(term68627, 94, term69619);
        setElement(term68627, 95, term69619);
        setElement(term68627, 96, term69619);
        setElement(term68627, 97, term69619);
        setElement(term68627, 98, term69619);
        setElement(term68627, 99, term69619);
        setElement(term68627, 100, term69619);
        setElement(term68627, 101, term69619);
        setElement(term68627, 102, term69619);
        setElement(term68627, 103, term69619);
        setElement(term68627, 104, term69619);
        setElement(term68627, 105, term69619);
        setElement(term68627, 106, term69619);
        setElement(term68627, 107, term69619);
        setField(term69511, term69511.getClass(), "folders", term68627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69511;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term69401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


