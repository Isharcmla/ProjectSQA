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

public class SevenZFile_readSubStreamsInfo_1404604771151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64421;
     Object term64531;

    public SevenZFile_readSubStreamsInfo_1404604771151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64421 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term64531 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term63274 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 170);
        Object term64639 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object term64747 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term64639, term64639.getClass(), "numUnpackSubStreams", 0);
        setElement(term63274, 0, term64639);
        setElement(term63274, 1, term64639);
        setElement(term63274, 2, term64639);
        setElement(term63274, 3, term64639);
        setElement(term63274, 4, term64639);
        setElement(term63274, 5, term64639);
        setElement(term63274, 6, term64639);
        setElement(term63274, 7, term64639);
        setElement(term63274, 8, term64639);
        setElement(term63274, 9, term64639);
        setElement(term63274, 10, term64639);
        setElement(term63274, 11, term64639);
        setElement(term63274, 12, term64639);
        setElement(term63274, 13, term64639);
        setElement(term63274, 14, term64639);
        setElement(term63274, 15, term64639);
        setElement(term63274, 16, term64639);
        setElement(term63274, 17, term64639);
        setElement(term63274, 18, term64639);
        setElement(term63274, 19, term64639);
        setElement(term63274, 20, term64639);
        setElement(term63274, 21, term64639);
        setElement(term63274, 22, term64639);
        setElement(term63274, 23, term64639);
        setElement(term63274, 24, term64639);
        setElement(term63274, 25, term64639);
        setElement(term63274, 26, term64639);
        setElement(term63274, 27, term64639);
        setElement(term63274, 28, term64639);
        setElement(term63274, 29, term64639);
        setElement(term63274, 30, term64639);
        setElement(term63274, 31, term64639);
        setElement(term63274, 32, term64639);
        setElement(term63274, 33, term64639);
        setElement(term63274, 34, term64639);
        setElement(term63274, 35, term64639);
        setElement(term63274, 36, term64639);
        setElement(term63274, 37, term64639);
        setElement(term63274, 38, term64639);
        setElement(term63274, 39, term64639);
        setElement(term63274, 40, term64639);
        setElement(term63274, 41, term64639);
        setElement(term63274, 42, term64639);
        setElement(term63274, 43, term64639);
        setElement(term63274, 44, term64639);
        setElement(term63274, 45, term64639);
        setElement(term63274, 46, term64639);
        setElement(term63274, 47, term64639);
        setElement(term63274, 48, term64639);
        setElement(term63274, 49, term64639);
        setElement(term63274, 50, term64639);
        setElement(term63274, 51, term64639);
        setElement(term63274, 52, term64639);
        setElement(term63274, 53, term64639);
        setIntField(term64747, term64747.getClass(), "numUnpackSubStreams", 0);
        setElement(term63274, 54, term64747);
        setElement(term63274, 55, term64639);
        setElement(term63274, 56, term64639);
        setElement(term63274, 57, term64639);
        setElement(term63274, 58, term64639);
        setElement(term63274, 59, term64639);
        setElement(term63274, 60, term64639);
        setElement(term63274, 61, term64639);
        setElement(term63274, 62, term64639);
        setElement(term63274, 63, term64639);
        setElement(term63274, 64, term64639);
        setElement(term63274, 65, term64639);
        setElement(term63274, 66, term64639);
        setElement(term63274, 67, term64639);
        setElement(term63274, 68, term64639);
        setElement(term63274, 69, term64639);
        setElement(term63274, 70, term64639);
        setElement(term63274, 71, term64639);
        setElement(term63274, 72, term64639);
        setElement(term63274, 73, term64639);
        setElement(term63274, 74, term64639);
        setElement(term63274, 75, term64639);
        setElement(term63274, 76, term64639);
        setElement(term63274, 77, term64639);
        setElement(term63274, 78, term64639);
        setElement(term63274, 79, term64639);
        setElement(term63274, 80, term64639);
        setElement(term63274, 81, term64639);
        setElement(term63274, 82, term64639);
        setElement(term63274, 83, term64639);
        setElement(term63274, 84, term64639);
        setElement(term63274, 85, term64639);
        setElement(term63274, 86, term64639);
        setElement(term63274, 87, term64639);
        setElement(term63274, 88, term64639);
        setElement(term63274, 89, term64639);
        setElement(term63274, 90, term64639);
        setElement(term63274, 91, term64639);
        setElement(term63274, 92, term64639);
        setElement(term63274, 93, term64639);
        setElement(term63274, 94, term64639);
        setElement(term63274, 95, term64639);
        setElement(term63274, 96, term64639);
        setElement(term63274, 97, term64639);
        setElement(term63274, 98, term64639);
        setElement(term63274, 99, term64639);
        setElement(term63274, 100, term64639);
        setElement(term63274, 101, term64639);
        setElement(term63274, 102, term64639);
        setElement(term63274, 103, term64639);
        setElement(term63274, 104, term64639);
        setElement(term63274, 105, term64639);
        setElement(term63274, 106, term64639);
        setElement(term63274, 107, term64639);
        setElement(term63274, 108, term64639);
        setElement(term63274, 109, term64639);
        setElement(term63274, 110, term64639);
        setElement(term63274, 111, term64639);
        setElement(term63274, 112, term64639);
        setElement(term63274, 113, term64639);
        setElement(term63274, 114, term64639);
        setElement(term63274, 115, term64639);
        setElement(term63274, 116, term64639);
        setElement(term63274, 117, term64639);
        setElement(term63274, 118, term64639);
        setElement(term63274, 119, term64639);
        setElement(term63274, 120, term64639);
        setElement(term63274, 121, term64639);
        setElement(term63274, 122, term64639);
        setElement(term63274, 123, term64639);
        setElement(term63274, 124, term64639);
        setElement(term63274, 125, term64639);
        setElement(term63274, 126, term64639);
        setElement(term63274, 127, term64639);
        setElement(term63274, 128, term64639);
        setElement(term63274, 129, term64639);
        setElement(term63274, 130, term64639);
        setElement(term63274, 131, term64639);
        setElement(term63274, 132, term64639);
        setElement(term63274, 133, term64639);
        setElement(term63274, 134, term64639);
        setElement(term63274, 135, term64639);
        setElement(term63274, 136, term64639);
        setElement(term63274, 137, term64639);
        setElement(term63274, 138, term64639);
        setElement(term63274, 139, term64639);
        setElement(term63274, 140, term64639);
        setElement(term63274, 141, term64639);
        setElement(term63274, 142, term64639);
        setElement(term63274, 143, term64639);
        setElement(term63274, 144, term64639);
        setElement(term63274, 145, term64639);
        setElement(term63274, 146, term64639);
        setElement(term63274, 147, term64639);
        setElement(term63274, 148, term64639);
        setElement(term63274, 149, term64639);
        setElement(term63274, 150, term64639);
        setElement(term63274, 151, term64639);
        setElement(term63274, 152, term64639);
        setElement(term63274, 153, term64639);
        setElement(term63274, 154, term64639);
        setElement(term63274, 155, term64639);
        setElement(term63274, 156, term64639);
        setElement(term63274, 157, term64639);
        setElement(term63274, 158, term64639);
        setElement(term63274, 159, term64639);
        setElement(term63274, 160, term64639);
        setElement(term63274, 161, term64639);
        setElement(term63274, 162, term64639);
        setElement(term63274, 163, term64639);
        setElement(term63274, 164, term64639);
        setElement(term63274, 165, term64639);
        setElement(term63274, 166, term64639);
        setElement(term63274, 167, term64639);
        setElement(term63274, 168, term64639);
        setElement(term63274, 169, term64639);
        setField(term64531, term64531.getClass(), "folders", term63274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64531;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term64421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


