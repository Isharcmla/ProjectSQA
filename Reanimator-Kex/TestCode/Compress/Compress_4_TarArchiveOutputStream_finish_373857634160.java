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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_finish_373857634160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122662;

    public TarArchiveOutputStream_finish_373857634160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122662 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term122265 = (byte[]) newByteArray(8);
        Object term122770 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term122422 = (byte[]) newByteArray(8);
        setBooleanField(term122662, term122662.getClass(), "haveUnclosedEntry", false);
        setField(term122662, term122662.getClass(), "recordBuf", term122265);
        setField(term122770, term122770.getClass(), "outStream", term122662);
        setIntField(term122770, term122770.getClass(), "recordSize", 8);
        setIntField(term122770, term122770.getClass(), "currRecIdx", -2147483648);
        setIntField(term122770, term122770.getClass(), "recsPerBlock", -2147483648);
        setField(term122770, term122770.getClass(), "blockBuffer", term122422);
        setIntField(term122770, term122770.getClass(), "blockSize", 0);
        setField(term122662, term122662.getClass(), "buffer", term122770);
        setLongField(term122662, term122662.getClass(), "currBytes", 8258576L);
        setLongField(term122662, term122662.getClass(), "currSize", 2882303761508801167L);
        setIntField(term122662, term122662.getClass(), "assemLen", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term122662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


