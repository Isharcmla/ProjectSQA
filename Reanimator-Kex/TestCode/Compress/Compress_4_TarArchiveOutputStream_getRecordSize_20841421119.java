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

public class TarArchiveOutputStream_getRecordSize_20841421119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term76104;

    public TarArchiveOutputStream_getRecordSize_20841421119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term241 = (byte[]) newByteArray(5);
        byte[] term248 = (byte[]) newByteArray(2);
        Object term251 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term252 = (byte[]) newByteArray(3);
        byte[] term264 = (byte[]) newByteArray(1);
        setLongField(term226, term226.getClass(), "currSize", 4872422362414183754L);
        setField(term226, term226.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term226, term226.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term241, 0, (byte) -23);
        setByteElement(term241, 1, (byte) 100);
        setByteElement(term241, 2, (byte) 106);
        setByteElement(term241, 3, (byte) -57);
        setByteElement(term241, 4, (byte) -103);
        setField(term226, term226.getClass(), "recordBuf", term241);
        setIntField(term226, term226.getClass(), "assemLen", -244121226);
        setByteElement(term248, 0, (byte) 98);
        setByteElement(term248, 1, (byte) 79);
        setField(term226, term226.getClass(), "assemBuf", term248);
        setField(term251, term251.getClass(), "inStream", null);
        setField(term251, term251.getClass(), "outStream", null);
        setByteElement(term252, 0, (byte) 61);
        setByteElement(term252, 1, (byte) -92);
        setByteElement(term252, 2, (byte) -42);
        setField(term251, term251.getClass(), "blockBuffer", term252);
        setIntField(term251, term251.getClass(), "currBlkIdx", -203030934);
        setIntField(term251, term251.getClass(), "currRecIdx", -1179120542);
        setIntField(term251, term251.getClass(), "blockSize", -73683645);
        setIntField(term251, term251.getClass(), "recordSize", -226514366);
        setIntField(term251, term251.getClass(), "recsPerBlock", 1193880199);
        setField(term226, term226.getClass(), "buffer", term251);
        setIntField(term226, term226.getClass(), "longFileMode", -1087774327);
        setBooleanField(term226, term226.getClass(), "closed", true);
        setBooleanField(term226, term226.getClass(), "haveUnclosedEntry", true);
        setField(term226, term226.getClass(), "out", null);
        setByteElement(term264, 0, (byte) 116);
        setField(term226, term226.getClass(), "oneByte", term264);
        term76104 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term76107 = (byte[]) newByteArray(5);
        byte[] term76108 = (byte[]) newByteArray(2);
        Object term76109 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term76110 = (byte[]) newByteArray(3);
        byte[] term76111 = (byte[]) newByteArray(1);
        setLongField(term76104, term76104.getClass(), "currSize", 4872422362414183754L);
        setField(term76104, term76104.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term76104, term76104.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term76107, 0, (byte) -23);
        setByteElement(term76107, 1, (byte) 100);
        setByteElement(term76107, 2, (byte) 106);
        setByteElement(term76107, 3, (byte) -57);
        setByteElement(term76107, 4, (byte) -103);
        setField(term76104, term76104.getClass(), "recordBuf", term76107);
        setIntField(term76104, term76104.getClass(), "assemLen", -244121226);
        setByteElement(term76108, 0, (byte) 98);
        setByteElement(term76108, 1, (byte) 79);
        setField(term76104, term76104.getClass(), "assemBuf", term76108);
        setField(term76109, term76109.getClass(), "inStream", null);
        setField(term76109, term76109.getClass(), "outStream", null);
        setByteElement(term76110, 0, (byte) 61);
        setByteElement(term76110, 1, (byte) -92);
        setByteElement(term76110, 2, (byte) -42);
        setField(term76109, term76109.getClass(), "blockBuffer", term76110);
        setIntField(term76109, term76109.getClass(), "currBlkIdx", -203030934);
        setIntField(term76109, term76109.getClass(), "currRecIdx", -1179120542);
        setIntField(term76109, term76109.getClass(), "blockSize", -73683645);
        setIntField(term76109, term76109.getClass(), "recordSize", -226514366);
        setIntField(term76109, term76109.getClass(), "recsPerBlock", 1193880199);
        setField(term76104, term76104.getClass(), "buffer", term76109);
        setIntField(term76104, term76104.getClass(), "longFileMode", -1087774327);
        setBooleanField(term76104, term76104.getClass(), "closed", true);
        setBooleanField(term76104, term76104.getClass(), "haveUnclosedEntry", true);
        setField(term76104, term76104.getClass(), "out", null);
        setByteElement(term76111, 0, (byte) 116);
        setField(term76104, term76104.getClass(), "oneByte", term76111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term226, args);
        assertTrue(recursiveEquals(term226, term76104));
        assertTrue(recursiveEquals(retValue, -226514366));
    }

};


