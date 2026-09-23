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

public class SevenZFile_readSubStreamsInfo_1404604771130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50213;
     Object term50265;
     Object term50375;

    public SevenZFile_readSubStreamsInfo_1404604771130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50213 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term50265 = newInstance(Class.forName("java.io.DataInputStream"));
        term50375 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term50072 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 1);
        Object term50483 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term50483, term50483.getClass(), "numUnpackSubStreams", 0);
        setElement(term50072, 0, term50483);
        setField(term50375, term50375.getClass(), "folders", term50072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = term50265;
        args[1] = term50375;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term50213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


