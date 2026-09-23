package org.apache.commons.compress.archivers;

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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.EqualityUtils.*;
import java.lang.Object;

public class ArchiveStreamFactory_createArchiveOutputStream_15789812921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4012;
     Object term4122;
     Object term36916;
     Object term36917;
     Object term25852;

    public ArchiveStreamFactory_createArchiveOutputStream_15789812921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4012 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term4122 = newInstance(Class.forName("org.tukaani.xz.SimpleOutputStream"));
        term36916 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term36917 = newInstance(Class.forName("org.tukaani.xz.SimpleOutputStream"));
        setField(term36917, term36917.getClass(), "out", null);
        setField(term36917, term36917.getClass(), "simpleFilter", null);
        setField(term36917, term36917.getClass(), "tmpbuf", null);
        setIntField(term36917, term36917.getClass(), "pos", 0);
        setIntField(term36917, term36917.getClass(), "unfiltered", 0);
        setField(term36917, term36917.getClass(), "exception", null);
        setBooleanField(term36917, term36917.getClass(), "finished", false);
        term25852 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term25855 = (byte[]) newByteArray(512);
        byte[] term26369 = (byte[]) newByteArray(512);
        Object term26882 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term26883 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term15817 = newInstance(Class.forName("org.tukaani.xz.SimpleOutputStream"));
        Object term26886 = newInstance(Class.forName("java.lang.Object"));
        byte[] term26890 = (byte[]) newByteArray(10240);
        Object term36899 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term36907 = (byte[]) newByteArray(1);
        setLongField(term25852, term25852.getClass(), "currSize", 0L);
        setField(term25852, term25852.getClass(), "currName", null);
        setLongField(term25852, term25852.getClass(), "currBytes", 0L);
        setField(term25852, term25852.getClass(), "recordBuf", term25855);
        setIntField(term25852, term25852.getClass(), "assemLen", 0);
        setField(term25852, term25852.getClass(), "assemBuf", term26369);
        setField(term26882, term26882.getClass(), "inStream", null);
        setLongField(term26883, term26883.getClass(), "bytesWritten", 0L);
        setField(term15817, term15817.getClass(), "out", null);
        setField(term15817, term15817.getClass(), "simpleFilter", null);
        setField(term15817, term15817.getClass(), "tmpbuf", null);
        setIntField(term15817, term15817.getClass(), "pos", 0);
        setIntField(term15817, term15817.getClass(), "unfiltered", 0);
        setField(term15817, term15817.getClass(), "exception", null);
        setBooleanField(term15817, term15817.getClass(), "finished", false);
        setField(term26883, term26883.getClass(), "out", term15817);
        setBooleanField(term26883, term26883.getClass(), "closed", false);
        setField(term26883, term26883.getClass(), "closeLock", term26886);
        setField(term26882, term26882.getClass(), "outStream", term26883);
        setIntField(term26882, term26882.getClass(), "blockSize", 10240);
        setIntField(term26882, term26882.getClass(), "recordSize", 512);
        setIntField(term26882, term26882.getClass(), "recsPerBlock", 20);
        setField(term26882, term26882.getClass(), "blockBuffer", term26890);
        setIntField(term26882, term26882.getClass(), "currBlkIdx", 0);
        setIntField(term26882, term26882.getClass(), "currRecIdx", 0);
        setField(term25852, term25852.getClass(), "buffer", term26882);
        setIntField(term25852, term25852.getClass(), "longFileMode", 0);
        setIntField(term25852, term25852.getClass(), "bigNumberMode", 0);
        setBooleanField(term25852, term25852.getClass(), "closed", false);
        setBooleanField(term25852, term25852.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term25852, term25852.getClass(), "finished", false);
        setField(term25852, term25852.getClass(), "out", term26883);
        setField(term36899, term36899.getClass(), "charset", "UTF8");
        setField(term25852, term25852.getClass(), "encoding", term36899);
        setBooleanField(term25852, term25852.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term25852, term25852.getClass(), "oneByte", term36907);
        setLongField(term25852, term25852.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "tar";
        args[1] = term4122;
        Object retValue = callMethod(klass, "createArchiveOutputStream", argTypes, term4012, args);
        assertTrue(recursiveEquals(term4012, term36916));
        assertTrue(recursiveEquals(term4122, "tar"));
        assertTrue(recursiveEquals(retValue, term25852));
    }

};


