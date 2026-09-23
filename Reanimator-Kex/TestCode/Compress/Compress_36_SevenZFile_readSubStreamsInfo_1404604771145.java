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

public class SevenZFile_readSubStreamsInfo_1404604771145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60263;
     Object term60373;

    public SevenZFile_readSubStreamsInfo_1404604771145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60263 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term60373 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term59981 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 26);
        Object term60481 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term60481, term60481.getClass(), "numUnpackSubStreams", 0);
        setElement(term59981, 0, term60481);
        setElement(term59981, 1, term60481);
        setElement(term59981, 2, term60481);
        setElement(term59981, 3, term60481);
        setElement(term59981, 4, term60481);
        setElement(term59981, 5, term60481);
        setElement(term59981, 6, term60481);
        setElement(term59981, 7, term60481);
        setElement(term59981, 8, term60481);
        setElement(term59981, 9, term60481);
        setElement(term59981, 10, term60481);
        setElement(term59981, 11, term60481);
        setElement(term59981, 12, term60481);
        setElement(term59981, 13, term60481);
        setElement(term59981, 14, term60481);
        setElement(term59981, 15, term60481);
        setElement(term59981, 16, term60481);
        setElement(term59981, 17, term60481);
        setElement(term59981, 18, term60481);
        setElement(term59981, 19, term60481);
        setElement(term59981, 20, term60481);
        setElement(term59981, 21, term60481);
        setElement(term59981, 22, term60481);
        setElement(term59981, 23, term60481);
        setElement(term59981, 24, term60481);
        setElement(term59981, 25, term60481);
        setField(term60373, term60373.getClass(), "folders", term59981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60373;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term60263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


