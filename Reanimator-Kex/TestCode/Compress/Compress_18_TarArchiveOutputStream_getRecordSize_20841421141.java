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

public class TarArchiveOutputStream_getRecordSize_20841421141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;
     Object term204463;

    public TarArchiveOutputStream_getRecordSize_20841421141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term623 = (byte[]) newByteArray(7);
        byte[] term632 = (byte[]) newByteArray(2);
        Object term635 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term639 = (byte[]) newByteArray(6);
        byte[] term654 = (byte[]) newByteArray(6);
        setLongField(term608, term608.getClass(), "currSize", -2585684163342970173L);
        setField(term608, term608.getClass(), "currName", "NRdvgJlhkX");
        setLongField(term608, term608.getClass(), "currBytes", 8059786003080744426L);
        setByteElement(term623, 0, (byte) 84);
        setByteElement(term623, 1, (byte) 85);
        setByteElement(term623, 2, (byte) -17);
        setByteElement(term623, 3, (byte) -83);
        setByteElement(term623, 4, (byte) 48);
        setByteElement(term623, 5, (byte) -128);
        setByteElement(term623, 6, (byte) 70);
        setField(term608, term608.getClass(), "recordBuf", term623);
        setIntField(term608, term608.getClass(), "assemLen", 972867650);
        setByteElement(term632, 0, (byte) -28);
        setByteElement(term632, 1, (byte) 115);
        setField(term608, term608.getClass(), "assemBuf", term632);
        setField(term635, term635.getClass(), "inStream", null);
        setField(term635, term635.getClass(), "outStream", null);
        setIntField(term635, term635.getClass(), "blockSize", 1655935355);
        setIntField(term635, term635.getClass(), "recordSize", -481533957);
        setIntField(term635, term635.getClass(), "recsPerBlock", 1240914516);
        setByteElement(term639, 0, (byte) 96);
        setByteElement(term639, 1, (byte) 51);
        setByteElement(term639, 2, (byte) -53);
        setByteElement(term639, 3, (byte) -8);
        setByteElement(term639, 4, (byte) -9);
        setByteElement(term639, 5, (byte) 97);
        setField(term635, term635.getClass(), "blockBuffer", term639);
        setIntField(term635, term635.getClass(), "currBlkIdx", -1465035361);
        setIntField(term635, term635.getClass(), "currRecIdx", 1090617576);
        setField(term608, term608.getClass(), "buffer", term635);
        setIntField(term608, term608.getClass(), "longFileMode", -1547384488);
        setIntField(term608, term608.getClass(), "bigNumberMode", 1442160736);
        setBooleanField(term608, term608.getClass(), "closed", true);
        setBooleanField(term608, term608.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term608, term608.getClass(), "finished", true);
        setField(term608, term608.getClass(), "out", null);
        setField(term608, term608.getClass(), "encoding", null);
        setBooleanField(term608, term608.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term654, 0, (byte) -46);
        setByteElement(term654, 1, (byte) 14);
        setByteElement(term654, 2, (byte) 34);
        setByteElement(term654, 3, (byte) 126);
        setByteElement(term654, 4, (byte) 7);
        setByteElement(term654, 5, (byte) -96);
        setField(term608, term608.getClass(), "oneByte", term654);
        setLongField(term608, term608.getClass(), "bytesWritten", -4365849114644724155L);
        term204463 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term204466 = (byte[]) newByteArray(7);
        byte[] term204467 = (byte[]) newByteArray(2);
        Object term204468 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term204469 = (byte[]) newByteArray(6);
        byte[] term204470 = (byte[]) newByteArray(6);
        setLongField(term204463, term204463.getClass(), "currSize", -2585684163342970173L);
        setField(term204463, term204463.getClass(), "currName", "NRdvgJlhkX");
        setLongField(term204463, term204463.getClass(), "currBytes", 8059786003080744426L);
        setByteElement(term204466, 0, (byte) 84);
        setByteElement(term204466, 1, (byte) 85);
        setByteElement(term204466, 2, (byte) -17);
        setByteElement(term204466, 3, (byte) -83);
        setByteElement(term204466, 4, (byte) 48);
        setByteElement(term204466, 5, (byte) -128);
        setByteElement(term204466, 6, (byte) 70);
        setField(term204463, term204463.getClass(), "recordBuf", term204466);
        setIntField(term204463, term204463.getClass(), "assemLen", 972867650);
        setByteElement(term204467, 0, (byte) -28);
        setByteElement(term204467, 1, (byte) 115);
        setField(term204463, term204463.getClass(), "assemBuf", term204467);
        setField(term204468, term204468.getClass(), "inStream", null);
        setField(term204468, term204468.getClass(), "outStream", null);
        setIntField(term204468, term204468.getClass(), "blockSize", 1655935355);
        setIntField(term204468, term204468.getClass(), "recordSize", -481533957);
        setIntField(term204468, term204468.getClass(), "recsPerBlock", 1240914516);
        setByteElement(term204469, 0, (byte) 96);
        setByteElement(term204469, 1, (byte) 51);
        setByteElement(term204469, 2, (byte) -53);
        setByteElement(term204469, 3, (byte) -8);
        setByteElement(term204469, 4, (byte) -9);
        setByteElement(term204469, 5, (byte) 97);
        setField(term204468, term204468.getClass(), "blockBuffer", term204469);
        setIntField(term204468, term204468.getClass(), "currBlkIdx", -1465035361);
        setIntField(term204468, term204468.getClass(), "currRecIdx", 1090617576);
        setField(term204463, term204463.getClass(), "buffer", term204468);
        setIntField(term204463, term204463.getClass(), "longFileMode", -1547384488);
        setIntField(term204463, term204463.getClass(), "bigNumberMode", 1442160736);
        setBooleanField(term204463, term204463.getClass(), "closed", true);
        setBooleanField(term204463, term204463.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term204463, term204463.getClass(), "finished", true);
        setField(term204463, term204463.getClass(), "out", null);
        setField(term204463, term204463.getClass(), "encoding", null);
        setBooleanField(term204463, term204463.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term204470, 0, (byte) -46);
        setByteElement(term204470, 1, (byte) 14);
        setByteElement(term204470, 2, (byte) 34);
        setByteElement(term204470, 3, (byte) 126);
        setByteElement(term204470, 4, (byte) 7);
        setByteElement(term204470, 5, (byte) -96);
        setField(term204463, term204463.getClass(), "oneByte", term204470);
        setLongField(term204463, term204463.getClass(), "bytesWritten", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term608, args);
        assertTrue(recursiveEquals(term608, term204463));
        assertTrue(recursiveEquals(retValue, -481533957));
    }

};


