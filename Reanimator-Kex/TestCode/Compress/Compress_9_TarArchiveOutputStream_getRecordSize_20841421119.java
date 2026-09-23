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
     Object term232;
     Object term76396;

    public TarArchiveOutputStream_getRecordSize_20841421119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term247 = (byte[]) newByteArray(5);
        byte[] term254 = (byte[]) newByteArray(2);
        Object term257 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term258 = (byte[]) newByteArray(3);
        byte[] term271 = (byte[]) newByteArray(1);
        setLongField(term232, term232.getClass(), "currSize", 6967924379644551255L);
        setField(term232, term232.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term232, term232.getClass(), "currBytes", -2813493605142626659L);
        setByteElement(term247, 0, (byte) -23);
        setByteElement(term247, 1, (byte) 100);
        setByteElement(term247, 2, (byte) 106);
        setByteElement(term247, 3, (byte) -57);
        setByteElement(term247, 4, (byte) -103);
        setField(term232, term232.getClass(), "recordBuf", term247);
        setIntField(term232, term232.getClass(), "assemLen", -244121226);
        setByteElement(term254, 0, (byte) 98);
        setByteElement(term254, 1, (byte) 79);
        setField(term232, term232.getClass(), "assemBuf", term254);
        setField(term257, term257.getClass(), "inStream", null);
        setField(term257, term257.getClass(), "outStream", null);
        setByteElement(term258, 0, (byte) 61);
        setByteElement(term258, 1, (byte) -92);
        setByteElement(term258, 2, (byte) -42);
        setField(term257, term257.getClass(), "blockBuffer", term258);
        setIntField(term257, term257.getClass(), "currBlkIdx", -203030934);
        setIntField(term257, term257.getClass(), "currRecIdx", -1179120542);
        setIntField(term257, term257.getClass(), "blockSize", -73683645);
        setIntField(term257, term257.getClass(), "recordSize", -226514366);
        setIntField(term257, term257.getClass(), "recsPerBlock", 1193880199);
        setField(term232, term232.getClass(), "buffer", term257);
        setIntField(term232, term232.getClass(), "longFileMode", -1087774327);
        setBooleanField(term232, term232.getClass(), "closed", true);
        setBooleanField(term232, term232.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term232, term232.getClass(), "finished", true);
        setField(term232, term232.getClass(), "out", null);
        setByteElement(term271, 0, (byte) 116);
        setField(term232, term232.getClass(), "oneByte", term271);
        setLongField(term232, term232.getClass(), "bytesWritten", -8885298608300233488L);
        term76396 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term76399 = (byte[]) newByteArray(5);
        byte[] term76400 = (byte[]) newByteArray(2);
        Object term76401 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term76402 = (byte[]) newByteArray(3);
        byte[] term76403 = (byte[]) newByteArray(1);
        setLongField(term76396, term76396.getClass(), "currSize", 6967924379644551255L);
        setField(term76396, term76396.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term76396, term76396.getClass(), "currBytes", -2813493605142626659L);
        setByteElement(term76399, 0, (byte) -23);
        setByteElement(term76399, 1, (byte) 100);
        setByteElement(term76399, 2, (byte) 106);
        setByteElement(term76399, 3, (byte) -57);
        setByteElement(term76399, 4, (byte) -103);
        setField(term76396, term76396.getClass(), "recordBuf", term76399);
        setIntField(term76396, term76396.getClass(), "assemLen", -244121226);
        setByteElement(term76400, 0, (byte) 98);
        setByteElement(term76400, 1, (byte) 79);
        setField(term76396, term76396.getClass(), "assemBuf", term76400);
        setField(term76401, term76401.getClass(), "inStream", null);
        setField(term76401, term76401.getClass(), "outStream", null);
        setByteElement(term76402, 0, (byte) 61);
        setByteElement(term76402, 1, (byte) -92);
        setByteElement(term76402, 2, (byte) -42);
        setField(term76401, term76401.getClass(), "blockBuffer", term76402);
        setIntField(term76401, term76401.getClass(), "currBlkIdx", -203030934);
        setIntField(term76401, term76401.getClass(), "currRecIdx", -1179120542);
        setIntField(term76401, term76401.getClass(), "blockSize", -73683645);
        setIntField(term76401, term76401.getClass(), "recordSize", -226514366);
        setIntField(term76401, term76401.getClass(), "recsPerBlock", 1193880199);
        setField(term76396, term76396.getClass(), "buffer", term76401);
        setIntField(term76396, term76396.getClass(), "longFileMode", -1087774327);
        setBooleanField(term76396, term76396.getClass(), "closed", true);
        setBooleanField(term76396, term76396.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term76396, term76396.getClass(), "finished", true);
        setField(term76396, term76396.getClass(), "out", null);
        setByteElement(term76403, 0, (byte) 116);
        setField(term76396, term76396.getClass(), "oneByte", term76403);
        setLongField(term76396, term76396.getClass(), "bytesWritten", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term232, args);
        assertTrue(recursiveEquals(term232, term76396));
        assertTrue(recursiveEquals(retValue, -226514366));
    }

};


