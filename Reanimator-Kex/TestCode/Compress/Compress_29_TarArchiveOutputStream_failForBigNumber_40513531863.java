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
import java.lang.RuntimeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TarArchiveOutputStream_failForBigNumber_40513531863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2756;
     Object term2803;
     Object term2805;

    public TarArchiveOutputStream_failForBigNumber_40513531863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2756 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2771 = (byte[]) newByteArray(4);
        byte[] term2777 = (byte[]) newByteArray(1);
        byte[] term2788 = (byte[]) newByteArray(1);
        setLongField(term2756, term2756.getClass(), "currSize", 5510783420697225605L);
        setField(term2756, term2756.getClass(), "currName", "hoicvmsovO");
        setLongField(term2756, term2756.getClass(), "currBytes", 6005241913654469005L);
        setByteElement(term2771, 0, (byte) 55);
        setByteElement(term2771, 1, (byte) -103);
        setByteElement(term2771, 2, (byte) -103);
        setByteElement(term2771, 3, (byte) -98);
        setField(term2756, term2756.getClass(), "recordBuf", term2771);
        setIntField(term2756, term2756.getClass(), "assemLen", -916584829);
        setByteElement(term2777, 0, (byte) -119);
        setField(term2756, term2756.getClass(), "assemBuf", term2777);
        setIntField(term2756, term2756.getClass(), "longFileMode", -2131181468);
        setIntField(term2756, term2756.getClass(), "bigNumberMode", 282916351);
        setIntField(term2756, term2756.getClass(), "recordsWritten", 880977281);
        setIntField(term2756, term2756.getClass(), "recordsPerBlock", 371943306);
        setIntField(term2756, term2756.getClass(), "recordSize", 982388293);
        setBooleanField(term2756, term2756.getClass(), "closed", false);
        setBooleanField(term2756, term2756.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2756, term2756.getClass(), "finished", true);
        setField(term2756, term2756.getClass(), "out", null);
        setField(term2756, term2756.getClass(), "zipEncoding", null);
        setBooleanField(term2756, term2756.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term2788, 0, (byte) 120);
        setField(term2756, term2756.getClass(), "oneByte", term2788);
        setLongField(term2756, term2756.getClass(), "bytesWritten", -1983291584002806658L);
        term2803 = new Long(5946780097489996391L);
        term2805 = new Long(-8652538484981166496L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = "eqJfYWRaEL";
        args[1] = term2803;
        args[2] = term2805;
        try {
            callMethod(klass, "failForBigNumber", argTypes, term2756, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


