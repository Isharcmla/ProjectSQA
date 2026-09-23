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
     Object term223;
     Object term76288;

    public TarArchiveOutputStream_getRecordSize_20841421119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term238 = (byte[]) newByteArray(5);
        byte[] term245 = (byte[]) newByteArray(2);
        Object term248 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term249 = (byte[]) newByteArray(3);
        byte[] term260 = (byte[]) newByteArray(1);
        setLongField(term223, term223.getClass(), "currSize", 4872422362414183754L);
        setField(term223, term223.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term223, term223.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term238, 0, (byte) -23);
        setByteElement(term238, 1, (byte) 100);
        setByteElement(term238, 2, (byte) 106);
        setByteElement(term238, 3, (byte) -57);
        setByteElement(term238, 4, (byte) -103);
        setField(term223, term223.getClass(), "recordBuf", term238);
        setIntField(term223, term223.getClass(), "assemLen", -244121226);
        setByteElement(term245, 0, (byte) 98);
        setByteElement(term245, 1, (byte) 79);
        setField(term223, term223.getClass(), "assemBuf", term245);
        setField(term248, term248.getClass(), "inStream", null);
        setField(term248, term248.getClass(), "outStream", null);
        setByteElement(term249, 0, (byte) 61);
        setByteElement(term249, 1, (byte) -92);
        setByteElement(term249, 2, (byte) -42);
        setField(term248, term248.getClass(), "blockBuffer", term249);
        setIntField(term248, term248.getClass(), "currBlkIdx", -203030934);
        setIntField(term248, term248.getClass(), "currRecIdx", -1179120542);
        setIntField(term248, term248.getClass(), "blockSize", -73683645);
        setIntField(term248, term248.getClass(), "recordSize", -226514366);
        setIntField(term248, term248.getClass(), "recsPerBlock", 1193880199);
        setField(term223, term223.getClass(), "buffer", term248);
        setIntField(term223, term223.getClass(), "longFileMode", -1087774327);
        setBooleanField(term223, term223.getClass(), "closed", false);
        setField(term223, term223.getClass(), "out", null);
        setByteElement(term260, 0, (byte) 116);
        setField(term223, term223.getClass(), "oneByte", term260);
        term76288 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term76291 = (byte[]) newByteArray(5);
        byte[] term76292 = (byte[]) newByteArray(2);
        Object term76293 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term76294 = (byte[]) newByteArray(3);
        byte[] term76295 = (byte[]) newByteArray(1);
        setLongField(term76288, term76288.getClass(), "currSize", 4872422362414183754L);
        setField(term76288, term76288.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term76288, term76288.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term76291, 0, (byte) -23);
        setByteElement(term76291, 1, (byte) 100);
        setByteElement(term76291, 2, (byte) 106);
        setByteElement(term76291, 3, (byte) -57);
        setByteElement(term76291, 4, (byte) -103);
        setField(term76288, term76288.getClass(), "recordBuf", term76291);
        setIntField(term76288, term76288.getClass(), "assemLen", -244121226);
        setByteElement(term76292, 0, (byte) 98);
        setByteElement(term76292, 1, (byte) 79);
        setField(term76288, term76288.getClass(), "assemBuf", term76292);
        setField(term76293, term76293.getClass(), "inStream", null);
        setField(term76293, term76293.getClass(), "outStream", null);
        setByteElement(term76294, 0, (byte) 61);
        setByteElement(term76294, 1, (byte) -92);
        setByteElement(term76294, 2, (byte) -42);
        setField(term76293, term76293.getClass(), "blockBuffer", term76294);
        setIntField(term76293, term76293.getClass(), "currBlkIdx", -203030934);
        setIntField(term76293, term76293.getClass(), "currRecIdx", -1179120542);
        setIntField(term76293, term76293.getClass(), "blockSize", -73683645);
        setIntField(term76293, term76293.getClass(), "recordSize", -226514366);
        setIntField(term76293, term76293.getClass(), "recsPerBlock", 1193880199);
        setField(term76288, term76288.getClass(), "buffer", term76293);
        setIntField(term76288, term76288.getClass(), "longFileMode", -1087774327);
        setBooleanField(term76288, term76288.getClass(), "closed", false);
        setField(term76288, term76288.getClass(), "out", null);
        setByteElement(term76295, 0, (byte) 116);
        setField(term76288, term76288.getClass(), "oneByte", term76295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term223, args);
        assertTrue(recursiveEquals(term223, term76288));
        assertTrue(recursiveEquals(retValue, -226514366));
    }

};


