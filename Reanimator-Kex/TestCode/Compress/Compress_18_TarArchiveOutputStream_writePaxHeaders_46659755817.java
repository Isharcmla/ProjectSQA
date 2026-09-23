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
import java.lang.Object;
import java.util.LinkedHashMap;

public class TarArchiveOutputStream_writePaxHeaders_46659755817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;
     Object term1014;

    public TarArchiveOutputStream_writePaxHeaders_46659755817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term958 = (byte[]) newByteArray(3);
        byte[] term963 = (byte[]) newByteArray(6);
        Object term970 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term974 = (byte[]) newByteArray(8);
        byte[] term991 = (byte[]) newByteArray(9);
        setLongField(term943, term943.getClass(), "currSize", -6823727938421990489L);
        setField(term943, term943.getClass(), "currName", "oVcInYnLWB");
        setLongField(term943, term943.getClass(), "currBytes", -484994522244390100L);
        setByteElement(term958, 0, (byte) 58);
        setByteElement(term958, 1, (byte) 12);
        setByteElement(term958, 2, (byte) 79);
        setField(term943, term943.getClass(), "recordBuf", term958);
        setIntField(term943, term943.getClass(), "assemLen", 1861318859);
        setByteElement(term963, 0, (byte) -4);
        setByteElement(term963, 1, (byte) -27);
        setByteElement(term963, 2, (byte) 120);
        setByteElement(term963, 3, (byte) -25);
        setByteElement(term963, 4, (byte) 114);
        setByteElement(term963, 5, (byte) 105);
        setField(term943, term943.getClass(), "assemBuf", term963);
        setField(term970, term970.getClass(), "inStream", null);
        setField(term970, term970.getClass(), "outStream", null);
        setIntField(term970, term970.getClass(), "blockSize", 1474524152);
        setIntField(term970, term970.getClass(), "recordSize", 568954359);
        setIntField(term970, term970.getClass(), "recsPerBlock", 53410913);
        setByteElement(term974, 0, (byte) -95);
        setByteElement(term974, 1, (byte) -6);
        setByteElement(term974, 2, (byte) 51);
        setByteElement(term974, 3, (byte) 122);
        setByteElement(term974, 4, (byte) 84);
        setByteElement(term974, 5, (byte) -36);
        setByteElement(term974, 6, (byte) 103);
        setByteElement(term974, 7, (byte) -63);
        setField(term970, term970.getClass(), "blockBuffer", term974);
        setIntField(term970, term970.getClass(), "currBlkIdx", -375014958);
        setIntField(term970, term970.getClass(), "currRecIdx", 1107176718);
        setField(term943, term943.getClass(), "buffer", term970);
        setIntField(term943, term943.getClass(), "longFileMode", 480137250);
        setIntField(term943, term943.getClass(), "bigNumberMode", -341152642);
        setBooleanField(term943, term943.getClass(), "closed", true);
        setBooleanField(term943, term943.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term943, term943.getClass(), "finished", true);
        setField(term943, term943.getClass(), "out", null);
        setField(term943, term943.getClass(), "encoding", null);
        setBooleanField(term943, term943.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term991, 0, (byte) 39);
        setByteElement(term991, 1, (byte) -54);
        setByteElement(term991, 2, (byte) 9);
        setByteElement(term991, 3, (byte) 19);
        setByteElement(term991, 4, (byte) -103);
        setByteElement(term991, 5, (byte) 61);
        setByteElement(term991, 6, (byte) -90);
        setByteElement(term991, 7, (byte) -27);
        setByteElement(term991, 8, (byte) 119);
        setField(term943, term943.getClass(), "oneByte", term991);
        setLongField(term943, term943.getClass(), "bytesWritten", 1233889271256172047L);
        term1014 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = "aJlieCFVtF";
        args[1] = term1014;
        callMethod(klass, "writePaxHeaders", argTypes, term943, args);
    }

};


