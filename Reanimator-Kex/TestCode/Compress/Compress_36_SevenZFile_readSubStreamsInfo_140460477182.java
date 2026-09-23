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

public class SevenZFile_readSubStreamsInfo_140460477182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31770;
     Object term31880;

    public SevenZFile_readSubStreamsInfo_140460477182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31770 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term31880 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term31624 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 3);
        Object term31988 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term31988, term31988.getClass(), "numUnpackSubStreams", 0);
        setElement(term31624, 0, term31988);
        setElement(term31624, 1, term31988);
        setElement(term31624, 2, term31988);
        setField(term31880, term31880.getClass(), "folders", term31624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31880;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term31770, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


