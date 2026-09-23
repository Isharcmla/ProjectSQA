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
import java.lang.Boolean;

public class TarArchiveOutputStream_setAddPaxHeadersForNonAsciiNames_55559346236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term283;
     Object term203156;

    public TarArchiveOutputStream_setAddPaxHeadersForNonAsciiNames_55559346236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term246 = (byte[]) newByteArray(7);
        byte[] term255 = (byte[]) newByteArray(1);
        Object term257 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term261 = (byte[]) newByteArray(6);
        byte[] term276 = (byte[]) newByteArray(5);
        setLongField(term231, term231.getClass(), "currSize", 4872422362414183754L);
        setField(term231, term231.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term231, term231.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term246, 0, (byte) 98);
        setByteElement(term246, 1, (byte) 67);
        setByteElement(term246, 2, (byte) 66);
        setByteElement(term246, 3, (byte) -121);
        setByteElement(term246, 4, (byte) -119);
        setByteElement(term246, 5, (byte) 71);
        setByteElement(term246, 6, (byte) 80);
        setField(term231, term231.getClass(), "recordBuf", term246);
        setIntField(term231, term231.getClass(), "assemLen", -203030934);
        setByteElement(term255, 0, (byte) 42);
        setField(term231, term231.getClass(), "assemBuf", term255);
        setField(term257, term257.getClass(), "inStream", null);
        setField(term257, term257.getClass(), "outStream", null);
        setIntField(term257, term257.getClass(), "blockSize", -1179120542);
        setIntField(term257, term257.getClass(), "recordSize", -73683645);
        setIntField(term257, term257.getClass(), "recsPerBlock", -226514366);
        setByteElement(term261, 0, (byte) 72);
        setByteElement(term261, 1, (byte) 111);
        setByteElement(term261, 2, (byte) 99);
        setByteElement(term261, 3, (byte) -12);
        setByteElement(term261, 4, (byte) -61);
        setByteElement(term261, 5, (byte) -85);
        setField(term257, term257.getClass(), "blockBuffer", term261);
        setIntField(term257, term257.getClass(), "currBlkIdx", 1193880199);
        setIntField(term257, term257.getClass(), "currRecIdx", -1087774327);
        setField(term231, term231.getClass(), "buffer", term257);
        setIntField(term231, term231.getClass(), "longFileMode", -1530420153);
        setIntField(term231, term231.getClass(), "bigNumberMode", -469968304);
        setBooleanField(term231, term231.getClass(), "closed", false);
        setBooleanField(term231, term231.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term231, term231.getClass(), "finished", false);
        setField(term231, term231.getClass(), "out", null);
        setField(term231, term231.getClass(), "encoding", null);
        setBooleanField(term231, term231.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term276, 0, (byte) -22);
        setByteElement(term276, 1, (byte) 93);
        setByteElement(term276, 2, (byte) 69);
        setByteElement(term276, 3, (byte) -74);
        setByteElement(term276, 4, (byte) -123);
        setField(term231, term231.getClass(), "oneByte", term276);
        setLongField(term231, term231.getClass(), "bytesWritten", -7237588299778557629L);
        term283 = new Boolean(false);
        term203156 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term203159 = (byte[]) newByteArray(7);
        byte[] term203160 = (byte[]) newByteArray(1);
        Object term203161 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term203162 = (byte[]) newByteArray(6);
        byte[] term203163 = (byte[]) newByteArray(5);
        setLongField(term203156, term203156.getClass(), "currSize", 4872422362414183754L);
        setField(term203156, term203156.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term203156, term203156.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term203159, 0, (byte) 98);
        setByteElement(term203159, 1, (byte) 67);
        setByteElement(term203159, 2, (byte) 66);
        setByteElement(term203159, 3, (byte) -121);
        setByteElement(term203159, 4, (byte) -119);
        setByteElement(term203159, 5, (byte) 71);
        setByteElement(term203159, 6, (byte) 80);
        setField(term203156, term203156.getClass(), "recordBuf", term203159);
        setIntField(term203156, term203156.getClass(), "assemLen", -203030934);
        setByteElement(term203160, 0, (byte) 42);
        setField(term203156, term203156.getClass(), "assemBuf", term203160);
        setField(term203161, term203161.getClass(), "inStream", null);
        setField(term203161, term203161.getClass(), "outStream", null);
        setIntField(term203161, term203161.getClass(), "blockSize", -1179120542);
        setIntField(term203161, term203161.getClass(), "recordSize", -73683645);
        setIntField(term203161, term203161.getClass(), "recsPerBlock", -226514366);
        setByteElement(term203162, 0, (byte) 72);
        setByteElement(term203162, 1, (byte) 111);
        setByteElement(term203162, 2, (byte) 99);
        setByteElement(term203162, 3, (byte) -12);
        setByteElement(term203162, 4, (byte) -61);
        setByteElement(term203162, 5, (byte) -85);
        setField(term203161, term203161.getClass(), "blockBuffer", term203162);
        setIntField(term203161, term203161.getClass(), "currBlkIdx", 1193880199);
        setIntField(term203161, term203161.getClass(), "currRecIdx", -1087774327);
        setField(term203156, term203156.getClass(), "buffer", term203161);
        setIntField(term203156, term203156.getClass(), "longFileMode", -1530420153);
        setIntField(term203156, term203156.getClass(), "bigNumberMode", -469968304);
        setBooleanField(term203156, term203156.getClass(), "closed", false);
        setBooleanField(term203156, term203156.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term203156, term203156.getClass(), "finished", false);
        setField(term203156, term203156.getClass(), "out", null);
        setField(term203156, term203156.getClass(), "encoding", null);
        setBooleanField(term203156, term203156.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term203163, 0, (byte) -22);
        setByteElement(term203163, 1, (byte) 93);
        setByteElement(term203163, 2, (byte) 69);
        setByteElement(term203163, 3, (byte) -74);
        setByteElement(term203163, 4, (byte) -123);
        setField(term203156, term203156.getClass(), "oneByte", term203163);
        setLongField(term203156, term203156.getClass(), "bytesWritten", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term283;
        callMethod(klass, "setAddPaxHeadersForNonAsciiNames", argTypes, term231, args);
        assertTrue(recursiveEquals(term231, term203156));
        assertTrue(recursiveEquals(term283, false));
    }

};


