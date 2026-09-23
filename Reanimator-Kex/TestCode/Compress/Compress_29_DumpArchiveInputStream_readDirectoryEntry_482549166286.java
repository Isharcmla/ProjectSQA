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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_readDirectoryEntry_482549166286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367871;
     Object term368577;

    public DumpArchiveInputStream_readDirectoryEntry_482549166286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term368019 = new Integer(0);
        HashMap term367919 = new HashMap();
        ((HashMap) term367919).put(term368019, term368019);
        term367871 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term367076 = (byte[]) newByteArray(2);
        Object term368193 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term368329 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term368453 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term367581 = (byte[]) newByteArray(4);
        byte[] term367086 = (byte[]) newByteArray(489);
        setField(term367871, term367871.getClass(), "names", term367919);
        setByteElement(term367076, 0, (byte) -1);
        setByteElement(term367076, 1, (byte) -1);
        setField(term367871, term367871.getClass(), "blockBuffer", term367076);
        setIntField(term368193, term368193.getClass(), "readOffset", 90);
        setIntField(term368193, term368193.getClass(), "blockSize", 90);
        setBooleanField(term368329, term368329.getClass(), "hasHitEOF", false);
        setBooleanField(term368329, term368329.getClass(), "isClosed", false);
        setLongField(term368329, term368329.getClass(), "entryOffset", 2040692507410432L);
        setLongField(term368329, term368329.getClass(), "entrySize", 2040692507410526L);
        setField(term368329, term368329.getClass(), "active", term368453);
        setByteElement(term367581, 0, (byte) -1);
        setByteElement(term367581, 1, (byte) -1);
        setField(term368329, term368329.getClass(), "readBuf", term367581);
        setIntField(term368329, term368329.getClass(), "recordOffset", 2147483569);
        setField(term368193, term368193.getClass(), "in", term368329);
        setBooleanField(term368193, term368193.getClass(), "isCompressed", false);
        setByteElement(term367086, 0, (byte) -1);
        setByteElement(term367086, 1, (byte) -1);
        setField(term368193, term368193.getClass(), "blockBuffer", term367086);
        setField(term367871, term367871.getClass(), "raw", term368193);
        term368577 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term368737 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term368577, term368577.getClass(), "size", 0L);
        setIntField(term368737, term368737.getClass(), "ino", 0);
        setIntField(term368737, term368737.getClass(), "count", 0);
        setField(term368577, term368577.getClass(), "header", term368737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term368577;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term367871, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


