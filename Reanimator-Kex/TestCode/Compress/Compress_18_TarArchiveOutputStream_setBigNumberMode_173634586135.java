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
import java.lang.Integer;

public class TarArchiveOutputStream_setBigNumberMode_173634586135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term204;
     Object term203045;

    public TarArchiveOutputStream_setBigNumberMode_173634586135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term171 = (byte[]) newByteArray(1);
        byte[] term174 = (byte[]) newByteArray(6);
        Object term181 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term185 = (byte[]) newByteArray(2);
        byte[] term196 = (byte[]) newByteArray(6);
        setLongField(term156, term156.getClass(), "currSize", -8400487765614892086L);
        setField(term156, term156.getClass(), "currName", "jJCZpVmanW");
        setLongField(term156, term156.getClass(), "currBytes", 5270370404989704783L);
        setByteElement(term171, 0, (byte) -54);
        setField(term156, term156.getClass(), "recordBuf", term171);
        setIntField(term156, term156.getClass(), "assemLen", 1048535127);
        setByteElement(term174, 0, (byte) 67);
        setByteElement(term174, 1, (byte) 78);
        setByteElement(term174, 2, (byte) 87);
        setByteElement(term174, 3, (byte) 121);
        setByteElement(term174, 4, (byte) -99);
        setByteElement(term174, 5, (byte) -2);
        setField(term156, term156.getClass(), "assemBuf", term174);
        setField(term181, term181.getClass(), "inStream", null);
        setField(term181, term181.getClass(), "outStream", null);
        setIntField(term181, term181.getClass(), "blockSize", -655067527);
        setIntField(term181, term181.getClass(), "recordSize", -6029667);
        setIntField(term181, term181.getClass(), "recsPerBlock", -2068769794);
        setByteElement(term185, 0, (byte) -16);
        setByteElement(term185, 1, (byte) -112);
        setField(term181, term181.getClass(), "blockBuffer", term185);
        setIntField(term181, term181.getClass(), "currBlkIdx", -117576464);
        setIntField(term181, term181.getClass(), "currRecIdx", -1007160944);
        setField(term156, term156.getClass(), "buffer", term181);
        setIntField(term156, term156.getClass(), "longFileMode", 1135664017);
        setIntField(term156, term156.getClass(), "bigNumberMode", 590364439);
        setBooleanField(term156, term156.getClass(), "closed", true);
        setBooleanField(term156, term156.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term156, term156.getClass(), "finished", true);
        setField(term156, term156.getClass(), "out", null);
        setField(term156, term156.getClass(), "encoding", null);
        setBooleanField(term156, term156.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term196, 0, (byte) -111);
        setByteElement(term196, 1, (byte) 23);
        setByteElement(term196, 2, (byte) -15);
        setByteElement(term196, 3, (byte) 36);
        setByteElement(term196, 4, (byte) 118);
        setByteElement(term196, 5, (byte) 106);
        setField(term156, term156.getClass(), "oneByte", term196);
        setLongField(term156, term156.getClass(), "bytesWritten", 7411271909051562686L);
        term204 = new Integer(865208305);
        term203045 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term203048 = (byte[]) newByteArray(1);
        byte[] term203049 = (byte[]) newByteArray(6);
        Object term203050 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term203051 = (byte[]) newByteArray(2);
        byte[] term203052 = (byte[]) newByteArray(6);
        setLongField(term203045, term203045.getClass(), "currSize", -8400487765614892086L);
        setField(term203045, term203045.getClass(), "currName", "jJCZpVmanW");
        setLongField(term203045, term203045.getClass(), "currBytes", 5270370404989704783L);
        setByteElement(term203048, 0, (byte) -54);
        setField(term203045, term203045.getClass(), "recordBuf", term203048);
        setIntField(term203045, term203045.getClass(), "assemLen", 1048535127);
        setByteElement(term203049, 0, (byte) 67);
        setByteElement(term203049, 1, (byte) 78);
        setByteElement(term203049, 2, (byte) 87);
        setByteElement(term203049, 3, (byte) 121);
        setByteElement(term203049, 4, (byte) -99);
        setByteElement(term203049, 5, (byte) -2);
        setField(term203045, term203045.getClass(), "assemBuf", term203049);
        setField(term203050, term203050.getClass(), "inStream", null);
        setField(term203050, term203050.getClass(), "outStream", null);
        setIntField(term203050, term203050.getClass(), "blockSize", -655067527);
        setIntField(term203050, term203050.getClass(), "recordSize", -6029667);
        setIntField(term203050, term203050.getClass(), "recsPerBlock", -2068769794);
        setByteElement(term203051, 0, (byte) -16);
        setByteElement(term203051, 1, (byte) -112);
        setField(term203050, term203050.getClass(), "blockBuffer", term203051);
        setIntField(term203050, term203050.getClass(), "currBlkIdx", -117576464);
        setIntField(term203050, term203050.getClass(), "currRecIdx", -1007160944);
        setField(term203045, term203045.getClass(), "buffer", term203050);
        setIntField(term203045, term203045.getClass(), "longFileMode", 1135664017);
        setIntField(term203045, term203045.getClass(), "bigNumberMode", 865208305);
        setBooleanField(term203045, term203045.getClass(), "closed", true);
        setBooleanField(term203045, term203045.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term203045, term203045.getClass(), "finished", true);
        setField(term203045, term203045.getClass(), "out", null);
        setField(term203045, term203045.getClass(), "encoding", null);
        setBooleanField(term203045, term203045.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term203052, 0, (byte) -111);
        setByteElement(term203052, 1, (byte) 23);
        setByteElement(term203052, 2, (byte) -15);
        setByteElement(term203052, 3, (byte) 36);
        setByteElement(term203052, 4, (byte) 118);
        setByteElement(term203052, 5, (byte) 106);
        setField(term203045, term203045.getClass(), "oneByte", term203052);
        setLongField(term203045, term203045.getClass(), "bytesWritten", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term204;
        callMethod(klass, "setBigNumberMode", argTypes, term156, args);
        assertTrue(recursiveEquals(term156, term203045));
        assertTrue(recursiveEquals(term204, 865208305));
    }

};


