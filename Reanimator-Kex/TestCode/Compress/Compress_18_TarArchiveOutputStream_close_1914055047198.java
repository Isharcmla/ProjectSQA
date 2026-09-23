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

public class TarArchiveOutputStream_close_1914055047198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327595;

    public TarArchiveOutputStream_close_1914055047198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327595 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term327703 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term327837 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term327421 = (byte[]) newByteArray(0);
        setBooleanField(term327595, term327595.getClass(), "finished", true);
        setBooleanField(term327595, term327595.getClass(), "closed", false);
        setBooleanField(term327837, term327837.getClass(), "finished", false);
        setBooleanField(term327837, term327837.getClass(), "haveUnclosedEntry", false);
        setField(term327837, term327837.getClass(), "recordBuf", term327421);
        setField(term327703, term327703.getClass(), "outStream", term327837);
        setIntField(term327703, term327703.getClass(), "currRecIdx", 0);
        setField(term327595, term327595.getClass(), "buffer", term327703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term327595, args);
    }

};


