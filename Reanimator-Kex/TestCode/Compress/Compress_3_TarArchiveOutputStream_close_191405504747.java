package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_191405504747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84575;

    public TarArchiveOutputStream_close_191405504747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84575 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term84255 = (byte[]) newByteArray(7);
        Object term84683 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term84781 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setBooleanField(term84575, term84575.getClass(), "closed", false);
        setField(term84575, term84575.getClass(), "recordBuf", term84255);
        setField(term84683, term84683.getClass(), "outStream", null);
        setField(term84683, term84683.getClass(), "inStream", term84781);
        setField(term84575, term84575.getClass(), "buffer", term84683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term84575, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


