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

public class SevenZFile_readSubStreamsInfo_1404604771134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52622;
     Object term52720;
     Object term52830;

    public SevenZFile_readSubStreamsInfo_1404604771134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52622 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term52720 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        term52830 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term52488 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 0);
        setField(term52830, term52830.getClass(), "folders", term52488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = term52720;
        args[1] = term52830;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term52622, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


