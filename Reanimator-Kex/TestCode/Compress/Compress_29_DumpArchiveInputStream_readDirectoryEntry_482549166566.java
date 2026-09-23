package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026466;
     Object term1026984;

    public DumpArchiveInputStream_readDirectoryEntry_482549166566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1026514 = new HashMap();
        term1026466 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1026059 = (byte[]) newByteArray(0);
        Object term1026740 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1026860 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        byte[] term1026066 = (byte[]) newByteArray(128);
        setField(term1026466, term1026466.getClass(), "names", term1026514);
        setField(term1026466, term1026466.getClass(), "blockBuffer", term1026059);
        setIntField(term1026740, term1026740.getClass(), "readOffset", 1);
        setIntField(term1026740, term1026740.getClass(), "blockSize", 1);
        setField(term1026740, term1026740.getClass(), "in", term1026860);
        setBooleanField(term1026740, term1026740.getClass(), "isCompressed", true);
        setIntField(term1026740, term1026740.getClass(), "currBlkIdx", -1);
        setField(term1026740, term1026740.getClass(), "blockBuffer", term1026066);
        setField(term1026466, term1026466.getClass(), "raw", term1026740);
        Class<? extends Object> term1030874 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1030873 = ((Class) term1030874).getDeclaredField((String) "BITS");
        ((Field) term1030873).setAccessible(true);
        Object enum163 = ((Field) term1030873).get((Object) null);
        term1026984 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1027144 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1026984, term1026984.getClass(), "size", 0L);
        setIntField(term1027144, term1027144.getClass(), "ino", 0);
        setField(term1027144, term1027144.getClass(), "type", enum163);
        setIntField(term1027144, term1027144.getClass(), "count", 0);
        setField(term1026984, term1026984.getClass(), "header", term1027144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1026984;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term1026466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


