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

public class ArchiveStreamFactory_createArchiveOutputStream_15789812940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56317;
     Object term56425;
     Object term174324;
     Object term174325;
     Object term163268;

    public ArchiveStreamFactory_createArchiveOutputStream_15789812940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56317 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term56425 = newInstance(Class.forName("org.tukaani.xz.BlockOutputStream"));
        term174324 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term174325 = newInstance(Class.forName("org.tukaani.xz.BlockOutputStream"));
        setField(term174325, term174325.getClass(), "out", null);
        setField(term174325, term174325.getClass(), "outCounted", null);
        setField(term174325, term174325.getClass(), "filterChain", null);
        setField(term174325, term174325.getClass(), "check", null);
        setIntField(term174325, term174325.getClass(), "headerSize", 0);
        setLongField(term174325, term174325.getClass(), "compressedSizeLimit", 0L);
        setLongField(term174325, term174325.getClass(), "uncompressedSize", 0L);
        term163268 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term163271 = (byte[]) newByteArray(512);
        byte[] term163785 = (byte[]) newByteArray(512);
        Object term164298 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term164299 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term153245 = newInstance(Class.forName("org.tukaani.xz.BlockOutputStream"));
        Object term164302 = newInstance(Class.forName("java.lang.Object"));
        byte[] term164303 = (byte[]) newByteArray(10240);
        byte[] term174315 = (byte[]) newByteArray(1);
        setLongField(term163268, term163268.getClass(), "currSize", 0L);
        setField(term163268, term163268.getClass(), "currName", null);
        setLongField(term163268, term163268.getClass(), "currBytes", 0L);
        setField(term163268, term163268.getClass(), "recordBuf", term163271);
        setIntField(term163268, term163268.getClass(), "assemLen", 0);
        setField(term163268, term163268.getClass(), "assemBuf", term163785);
        setField(term164298, term164298.getClass(), "inStream", null);
        setLongField(term164299, term164299.getClass(), "bytesWritten", 0L);
        setField(term153245, term153245.getClass(), "out", null);
        setField(term153245, term153245.getClass(), "outCounted", null);
        setField(term153245, term153245.getClass(), "filterChain", null);
        setField(term153245, term153245.getClass(), "check", null);
        setIntField(term153245, term153245.getClass(), "headerSize", 0);
        setLongField(term153245, term153245.getClass(), "compressedSizeLimit", 0L);
        setLongField(term153245, term153245.getClass(), "uncompressedSize", 0L);
        setField(term164299, term164299.getClass(), "out", term153245);
        setBooleanField(term164299, term164299.getClass(), "closed", false);
        setField(term164299, term164299.getClass(), "closeLock", term164302);
        setField(term164298, term164298.getClass(), "outStream", term164299);
        setField(term164298, term164298.getClass(), "blockBuffer", term164303);
        setIntField(term164298, term164298.getClass(), "currBlkIdx", 0);
        setIntField(term164298, term164298.getClass(), "currRecIdx", 0);
        setIntField(term164298, term164298.getClass(), "blockSize", 10240);
        setIntField(term164298, term164298.getClass(), "recordSize", 512);
        setIntField(term164298, term164298.getClass(), "recsPerBlock", 20);
        setField(term163268, term163268.getClass(), "buffer", term164298);
        setIntField(term163268, term163268.getClass(), "longFileMode", 0);
        setIntField(term163268, term163268.getClass(), "bigFileMode", 0);
        setBooleanField(term163268, term163268.getClass(), "closed", false);
        setBooleanField(term163268, term163268.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term163268, term163268.getClass(), "finished", false);
        setField(term163268, term163268.getClass(), "out", term164299);
        setField(term163268, term163268.getClass(), "oneByte", term174315);
        setLongField(term163268, term163268.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "tar";
        args[1] = term56425;
        Object retValue = callMethod(klass, "createArchiveOutputStream", argTypes, term56317, args);
        assertTrue(recursiveEquals(term56317, term174324));
        assertTrue(recursiveEquals(term56425, "tar"));
        assertTrue(recursiveEquals(retValue, term163268));
    }

};


