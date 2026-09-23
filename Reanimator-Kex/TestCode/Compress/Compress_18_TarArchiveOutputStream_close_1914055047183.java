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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322223;

    public TarArchiveOutputStream_close_1914055047183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322223 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term322331 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term322403 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        setBooleanField(term322223, term322223.getClass(), "finished", true);
        setBooleanField(term322223, term322223.getClass(), "closed", false);
        setField(term322331, term322331.getClass(), "outStream", null);
        setField(term322331, term322331.getClass(), "inStream", null);
        setField(term322223, term322223.getClass(), "buffer", term322331);
        setField(term322223, term322223.getClass(), "out", term322403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term322223, args);
    }

};


