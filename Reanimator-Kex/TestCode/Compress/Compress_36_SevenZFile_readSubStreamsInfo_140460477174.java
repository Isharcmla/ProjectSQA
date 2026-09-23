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

public class SevenZFile_readSubStreamsInfo_140460477174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29603;
     Object term29713;

    public SevenZFile_readSubStreamsInfo_140460477174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29603 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        term29713 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        Object[] term29467 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 1);
        Object term29821 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        setIntField(term29821, term29821.getClass(), "numUnpackSubStreams", 0);
        setElement(term29467, 0, term29821);
        setField(term29713, term29713.getClass(), "folders", term29467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInput");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Archive");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29713;
        try {
            callMethod(klass, "readSubStreamsInfo", argTypes, term29603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


