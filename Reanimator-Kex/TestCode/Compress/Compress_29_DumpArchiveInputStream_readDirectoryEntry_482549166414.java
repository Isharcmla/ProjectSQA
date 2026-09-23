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
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674554;
     Object term675020;

    public DumpArchiveInputStream_readDirectoryEntry_482549166414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term674602 = new HashMap();
        term674554 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term673769 = (byte[]) newByteArray(0);
        Object term674828 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term674896 = newInstance(Class.forName("java.util.Base64$DecInputStream"));
        byte[] term673775 = (byte[]) newByteArray(512);
        setField(term674554, term674554.getClass(), "names", term674602);
        setField(term674554, term674554.getClass(), "blockBuffer", term673769);
        setIntField(term674828, term674828.getClass(), "readOffset", 1);
        setIntField(term674828, term674828.getClass(), "blockSize", 1);
        setField(term674828, term674828.getClass(), "in", term674896);
        setBooleanField(term674828, term674828.getClass(), "isCompressed", false);
        setField(term674828, term674828.getClass(), "blockBuffer", term673775);
        setField(term674554, term674554.getClass(), "raw", term674828);
        Class<? extends Object> term680642 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term680641 = ((Class) term680642).getDeclaredField((String) "END");
        ((Field) term680641).setAccessible(true);
        Object enum91 = ((Field) term680641).get((Object) null);
        term675020 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term675180 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term675020, term675020.getClass(), "size", 0L);
        setIntField(term675180, term675180.getClass(), "ino", 0);
        setField(term675180, term675180.getClass(), "type", enum91);
        setIntField(term675180, term675180.getClass(), "count", 0);
        setField(term675020, term675020.getClass(), "header", term675180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term675020;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term674554, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


