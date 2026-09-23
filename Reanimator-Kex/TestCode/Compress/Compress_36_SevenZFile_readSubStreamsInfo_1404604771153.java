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

public class SevenZFile_readSubStreamsInfo_1404604771153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65531;
     Object term65641;

    public SevenZFile_readSubStreamsInfo_1404604771153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65531 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term65641 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term65171 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 39);
        Object term65749 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term65749, term65749.getClass(), "numUnpackSubStreams", 0);
        setElement(term65171, 0, term65749);
        setElement(term65171, 1, term65749);
        setElement(term65171, 2, term65749);
        setElement(term65171, 3, term65749);
        setElement(term65171, 4, term65749);
        setElement(term65171, 5, term65749);
        setElement(term65171, 6, term65749);
        setElement(term65171, 7, term65749);
        setElement(term65171, 8, term65749);
        setElement(term65171, 9, term65749);
        setElement(term65171, 10, term65749);
        setElement(term65171, 11, term65749);
        setElement(term65171, 12, term65749);
        setElement(term65171, 13, term65749);
        setElement(term65171, 14, term65749);
        setElement(term65171, 15, term65749);
        setElement(term65171, 16, term65749);
        setElement(term65171, 17, term65749);
        setElement(term65171, 18, term65749);
        setElement(term65171, 19, term65749);
        setElement(term65171, 20, term65749);
        setElement(term65171, 21, term65749);
        setElement(term65171, 22, term65749);
        setElement(term65171, 23, term65749);
        setElement(term65171, 24, term65749);
        setElement(term65171, 25, term65749);
        setElement(term65171, 26, term65749);
        setElement(term65171, 27, term65749);
        setElement(term65171, 28, term65749);
        setElement(term65171, 29, term65749);
        setElement(term65171, 30, term65749);
        setElement(term65171, 31, term65749);
        setElement(term65171, 32, term65749);
        setElement(term65171, 33, term65749);
        setElement(term65171, 34, term65749);
        setElement(term65171, 35, term65749);
        setElement(term65171, 36, term65749);
        setElement(term65171, 37, term65749);
        setElement(term65171, 38, term65749);
        setField(term65641, term65641.getClass(), "folders", term65171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term65641;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term65531, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


