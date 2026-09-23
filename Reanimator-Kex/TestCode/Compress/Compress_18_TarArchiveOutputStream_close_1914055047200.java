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
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319435;
     Object term358027;

    public TarArchiveOutputStream_close_1914055047200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319435 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term319543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term319631 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        setBooleanField(term319435, term319435.getClass(), "finished", true);
        setBooleanField(term319435, term319435.getClass(), "closed", false);
        setField(term319543, term319543.getClass(), "outStream", null);
        setField(term319543, term319543.getClass(), "inStream", null);
        setField(term319435, term319435.getClass(), "buffer", term319543);
        setField(term319435, term319435.getClass(), "out", term319631);
        term358027 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term358028 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term358029 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        setLongField(term358027, term358027.getClass(), "currSize", 0L);
        setField(term358027, term358027.getClass(), "currName", null);
        setLongField(term358027, term358027.getClass(), "currBytes", 0L);
        setField(term358027, term358027.getClass(), "recordBuf", null);
        setIntField(term358027, term358027.getClass(), "assemLen", 0);
        setField(term358027, term358027.getClass(), "assemBuf", null);
        setField(term358028, term358028.getClass(), "inStream", null);
        setField(term358028, term358028.getClass(), "outStream", null);
        setIntField(term358028, term358028.getClass(), "blockSize", 0);
        setIntField(term358028, term358028.getClass(), "recordSize", 0);
        setIntField(term358028, term358028.getClass(), "recsPerBlock", 0);
        setField(term358028, term358028.getClass(), "blockBuffer", null);
        setIntField(term358028, term358028.getClass(), "currBlkIdx", 0);
        setIntField(term358028, term358028.getClass(), "currRecIdx", 0);
        setField(term358027, term358027.getClass(), "buffer", term358028);
        setIntField(term358027, term358027.getClass(), "longFileMode", 0);
        setIntField(term358027, term358027.getClass(), "bigNumberMode", 0);
        setBooleanField(term358027, term358027.getClass(), "closed", true);
        setBooleanField(term358027, term358027.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term358027, term358027.getClass(), "finished", true);
        setField(term358027, term358027.getClass(), "out", term358029);
        setField(term358027, term358027.getClass(), "encoding", null);
        setBooleanField(term358027, term358027.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term358027, term358027.getClass(), "oneByte", null);
        setLongField(term358027, term358027.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term319435, args);
        assertTrue(recursiveEquals(term319435, term358027));
    }

};


