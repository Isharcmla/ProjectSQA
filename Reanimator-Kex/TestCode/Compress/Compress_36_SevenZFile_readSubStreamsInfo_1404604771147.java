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

public class SevenZFile_readSubStreamsInfo_1404604771147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61071;
     Object term61181;

    public SevenZFile_readSubStreamsInfo_1404604771147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61071 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term61181 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term60759 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 31);
        Object term61289 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term61289, term61289.getClass(), "numUnpackSubStreams", 0);
        setElement(term60759, 0, term61289);
        setElement(term60759, 1, term61289);
        setElement(term60759, 2, term61289);
        setElement(term60759, 3, term61289);
        setElement(term60759, 4, term61289);
        setElement(term60759, 5, term61289);
        setElement(term60759, 6, term61289);
        setElement(term60759, 7, term61289);
        setElement(term60759, 8, term61289);
        setElement(term60759, 9, term61289);
        setElement(term60759, 10, term61289);
        setElement(term60759, 11, term61289);
        setElement(term60759, 12, term61289);
        setElement(term60759, 13, term61289);
        setElement(term60759, 14, term61289);
        setElement(term60759, 15, term61289);
        setElement(term60759, 16, term61289);
        setElement(term60759, 17, term61289);
        setElement(term60759, 18, term61289);
        setElement(term60759, 19, term61289);
        setElement(term60759, 20, term61289);
        setElement(term60759, 21, term61289);
        setElement(term60759, 22, term61289);
        setElement(term60759, 23, term61289);
        setElement(term60759, 24, term61289);
        setElement(term60759, 25, term61289);
        setElement(term60759, 26, term61289);
        setElement(term60759, 27, term61289);
        setElement(term60759, 28, term61289);
        setElement(term60759, 29, term61289);
        setElement(term60759, 30, term61289);
        setField(term61181, term61181.getClass(), "folders", term60759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61181;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term61071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


