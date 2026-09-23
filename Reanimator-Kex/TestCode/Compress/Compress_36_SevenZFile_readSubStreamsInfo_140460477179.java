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

public class SevenZFile_readSubStreamsInfo_140460477179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31072;
     Object term31182;

    public SevenZFile_readSubStreamsInfo_140460477179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31072 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term31182 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term30942 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 0);
        setField(term31182, term31182.getClass(), "folders", term30942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31182;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term31072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


