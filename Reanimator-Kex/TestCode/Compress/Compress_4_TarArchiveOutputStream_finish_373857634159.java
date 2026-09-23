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
import java.lang.StackOverflowError;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_finish_373857634159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122154;

    public TarArchiveOutputStream_finish_373857634159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122154 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term121966 = (byte[]) newByteArray(0);
        Object term122262 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setBooleanField(term122154, term122154.getClass(), "haveUnclosedEntry", false);
        setField(term122154, term122154.getClass(), "recordBuf", term121966);
        setField(term122262, term122262.getClass(), "outStream", term122154);
        setIntField(term122262, term122262.getClass(), "recordSize", 0);
        setIntField(term122262, term122262.getClass(), "currRecIdx", -2147483648);
        setIntField(term122262, term122262.getClass(), "recsPerBlock", -2147483648);
        setField(term122262, term122262.getClass(), "blockBuffer", term121966);
        setIntField(term122262, term122262.getClass(), "blockSize", 1);
        setField(term122154, term122154.getClass(), "buffer", term122262);
        setLongField(term122154, term122154.getClass(), "currBytes", 576495936675512319L);
        setLongField(term122154, term122154.getClass(), "currSize", 3863176435388645375L);
        setIntField(term122154, term122154.getClass(), "assemLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term122154, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


