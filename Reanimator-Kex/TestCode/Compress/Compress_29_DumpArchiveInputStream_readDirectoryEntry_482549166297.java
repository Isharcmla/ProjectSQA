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
import java.lang.Integer;
import java.lang.Object;

public class DumpArchiveInputStream_readDirectoryEntry_482549166297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398716;
     Object term399286;

    public DumpArchiveInputStream_readDirectoryEntry_482549166297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term398864 = new Integer(0);
        HashMap term398764 = new HashMap();
        ((HashMap) term398764).put(term398864, term398864);
        ((HashMap) term398764).put(term398864, term398864);
        term398716 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term398308 = (byte[]) newByteArray(0);
        Object term399038 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] term398314 = (byte[]) newByteArray(128);
        Object term399162 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term398448 = (byte[]) newByteArray(10);
        setField(term398716, term398716.getClass(), "names", term398764);
        setField(term398716, term398716.getClass(), "blockBuffer", term398308);
        setIntField(term399038, term399038.getClass(), "readOffset", 0);
        setIntField(term399038, term399038.getClass(), "blockSize", 0);
        setField(term399038, term399038.getClass(), "in", term398716);
        setBooleanField(term399038, term399038.getClass(), "isCompressed", true);
        setIntField(term399038, term399038.getClass(), "currBlkIdx", 0);
        setByteElement(term398314, 0, (byte) -1);
        setByteElement(term398314, 1, (byte) -1);
        setByteElement(term398314, 2, (byte) -1);
        setField(term399038, term399038.getClass(), "blockBuffer", term398314);
        setField(term398716, term398716.getClass(), "raw", term399038);
        setBooleanField(term398716, term398716.getClass(), "hasHitEOF", false);
        setBooleanField(term398716, term398716.getClass(), "isClosed", false);
        setLongField(term398716, term398716.getClass(), "entryOffset", 2593931617101743170L);
        setLongField(term398716, term398716.getClass(), "entrySize", 2593931617101743171L);
        setField(term398716, term398716.getClass(), "active", term399162);
        setByteElement(term398448, 0, (byte) -1);
        setByteElement(term398448, 1, (byte) -1);
        setByteElement(term398448, 2, (byte) -1);
        setField(term398716, term398716.getClass(), "readBuf", term398448);
        setIntField(term398716, term398716.getClass(), "recordOffset", 10);
        term399286 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term399446 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term399286, term399286.getClass(), "size", 0L);
        setIntField(term399446, term399446.getClass(), "ino", 0);
        setIntField(term399446, term399446.getClass(), "count", 0);
        setField(term399286, term399286.getClass(), "header", term399446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term399286;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term398716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


