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

public class TarArchiveOutputStream_close_1914055047189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324768;

    public TarArchiveOutputStream_close_1914055047189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324768 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term324481 = (byte[]) newByteArray(5);
        Object term324876 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setBooleanField(term324768, term324768.getClass(), "finished", false);
        setBooleanField(term324768, term324768.getClass(), "haveUnclosedEntry", false);
        setField(term324768, term324768.getClass(), "recordBuf", term324481);
        setField(term324876, term324876.getClass(), "outStream", term324768);
        setIntField(term324876, term324876.getClass(), "recordSize", 5);
        setIntField(term324876, term324876.getClass(), "currRecIdx", -2147483648);
        setIntField(term324876, term324876.getClass(), "recsPerBlock", -2147483648);
        setField(term324876, term324876.getClass(), "blockBuffer", null);
        setIntField(term324876, term324876.getClass(), "blockSize", 1);
        setField(term324768, term324768.getClass(), "buffer", term324876);
        setLongField(term324768, term324768.getClass(), "currBytes", -2L);
        setLongField(term324768, term324768.getClass(), "currSize", 0L);
        setIntField(term324768, term324768.getClass(), "assemLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term324768, args);
    }

};


