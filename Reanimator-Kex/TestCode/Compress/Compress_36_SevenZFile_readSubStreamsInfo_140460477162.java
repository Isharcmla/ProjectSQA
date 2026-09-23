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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SevenZFile_readSubStreamsInfo_140460477162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27054;
     Object term27108;
     Object term27218;

    public SevenZFile_readSubStreamsInfo_140460477162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27054 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term27108 = newInstance(Class.forName("java.io.RandomAccessFile"));
        term27218 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term26897 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 4);
        Object term27326 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object term27434 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term27326, term27326.getClass(), "numUnpackSubStreams", 0);
        setElement(term26897, 0, term27326);
        setIntField(term27434, term27434.getClass(), "numUnpackSubStreams", 0);
        setElement(term26897, 1, term27434);
        setElement(term26897, 2, term27434);
        setElement(term26897, 3, term27434);
        setField(term27218, term27218.getClass(), "folders", term26897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = term27108;
        args[1] = term27218;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term27054, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


