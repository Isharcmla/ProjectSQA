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
import java.util.LinkedHashMap;
import java.lang.Long;

public class TarArchiveOutputStream_addPaxHeaderForBigNumber_99216259951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2056;
     Object term2113;
     Object term2131;
     Object term2133;
     Object term207661;
     Object term207669;

    public TarArchiveOutputStream_addPaxHeaderForBigNumber_99216259951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2056 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2071 = (byte[]) newByteArray(9);
        byte[] term2082 = (byte[]) newByteArray(3);
        Object term2086 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term2090 = (byte[]) newByteArray(7);
        byte[] term2106 = (byte[]) newByteArray(5);
        setLongField(term2056, term2056.getClass(), "currSize", -2644215923136513282L);
        setField(term2056, term2056.getClass(), "currName", "IDCWpPLRkE");
        setLongField(term2056, term2056.getClass(), "currBytes", -1468719814009985452L);
        setByteElement(term2071, 0, (byte) 84);
        setByteElement(term2071, 1, (byte) 114);
        setByteElement(term2071, 2, (byte) 60);
        setByteElement(term2071, 3, (byte) -20);
        setByteElement(term2071, 4, (byte) 100);
        setByteElement(term2071, 5, (byte) -41);
        setByteElement(term2071, 6, (byte) -70);
        setByteElement(term2071, 7, (byte) -5);
        setByteElement(term2071, 8, (byte) 119);
        setField(term2056, term2056.getClass(), "recordBuf", term2071);
        setIntField(term2056, term2056.getClass(), "assemLen", 114754804);
        setByteElement(term2082, 0, (byte) 81);
        setByteElement(term2082, 1, (byte) -28);
        setByteElement(term2082, 2, (byte) -18);
        setField(term2056, term2056.getClass(), "assemBuf", term2082);
        setField(term2086, term2086.getClass(), "inStream", null);
        setField(term2086, term2086.getClass(), "outStream", null);
        setIntField(term2086, term2086.getClass(), "blockSize", 1687361082);
        setIntField(term2086, term2086.getClass(), "recordSize", 584893196);
        setIntField(term2086, term2086.getClass(), "recsPerBlock", 497269071);
        setByteElement(term2090, 0, (byte) -61);
        setByteElement(term2090, 1, (byte) 70);
        setByteElement(term2090, 2, (byte) 89);
        setByteElement(term2090, 3, (byte) -99);
        setByteElement(term2090, 4, (byte) 59);
        setByteElement(term2090, 5, (byte) -99);
        setByteElement(term2090, 6, (byte) 61);
        setField(term2086, term2086.getClass(), "blockBuffer", term2090);
        setIntField(term2086, term2086.getClass(), "currBlkIdx", -1899301124);
        setIntField(term2086, term2086.getClass(), "currRecIdx", -1882480155);
        setField(term2056, term2056.getClass(), "buffer", term2086);
        setIntField(term2056, term2056.getClass(), "longFileMode", -1410220680);
        setIntField(term2056, term2056.getClass(), "bigNumberMode", 389427431);
        setBooleanField(term2056, term2056.getClass(), "closed", false);
        setBooleanField(term2056, term2056.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term2056, term2056.getClass(), "finished", false);
        setField(term2056, term2056.getClass(), "out", null);
        setField(term2056, term2056.getClass(), "encoding", null);
        setBooleanField(term2056, term2056.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term2106, 0, (byte) 100);
        setByteElement(term2106, 1, (byte) 55);
        setByteElement(term2106, 2, (byte) -111);
        setByteElement(term2106, 3, (byte) -127);
        setByteElement(term2106, 4, (byte) 19);
        setField(term2056, term2056.getClass(), "oneByte", term2106);
        setLongField(term2056, term2056.getClass(), "bytesWritten", -7738503207562305297L);
        term2113 = new LinkedHashMap();
        term2131 = new Long(3825396310311739952L);
        term2133 = new Long(-3838084482494604218L);
        term207661 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term207664 = (byte[]) newByteArray(9);
        byte[] term207665 = (byte[]) newByteArray(3);
        Object term207666 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term207667 = (byte[]) newByteArray(7);
        byte[] term207668 = (byte[]) newByteArray(5);
        setLongField(term207661, term207661.getClass(), "currSize", -2644215923136513282L);
        setField(term207661, term207661.getClass(), "currName", "IDCWpPLRkE");
        setLongField(term207661, term207661.getClass(), "currBytes", -1468719814009985452L);
        setByteElement(term207664, 0, (byte) 84);
        setByteElement(term207664, 1, (byte) 114);
        setByteElement(term207664, 2, (byte) 60);
        setByteElement(term207664, 3, (byte) -20);
        setByteElement(term207664, 4, (byte) 100);
        setByteElement(term207664, 5, (byte) -41);
        setByteElement(term207664, 6, (byte) -70);
        setByteElement(term207664, 7, (byte) -5);
        setByteElement(term207664, 8, (byte) 119);
        setField(term207661, term207661.getClass(), "recordBuf", term207664);
        setIntField(term207661, term207661.getClass(), "assemLen", 114754804);
        setByteElement(term207665, 0, (byte) 81);
        setByteElement(term207665, 1, (byte) -28);
        setByteElement(term207665, 2, (byte) -18);
        setField(term207661, term207661.getClass(), "assemBuf", term207665);
        setField(term207666, term207666.getClass(), "inStream", null);
        setField(term207666, term207666.getClass(), "outStream", null);
        setIntField(term207666, term207666.getClass(), "blockSize", 1687361082);
        setIntField(term207666, term207666.getClass(), "recordSize", 584893196);
        setIntField(term207666, term207666.getClass(), "recsPerBlock", 497269071);
        setByteElement(term207667, 0, (byte) -61);
        setByteElement(term207667, 1, (byte) 70);
        setByteElement(term207667, 2, (byte) 89);
        setByteElement(term207667, 3, (byte) -99);
        setByteElement(term207667, 4, (byte) 59);
        setByteElement(term207667, 5, (byte) -99);
        setByteElement(term207667, 6, (byte) 61);
        setField(term207666, term207666.getClass(), "blockBuffer", term207667);
        setIntField(term207666, term207666.getClass(), "currBlkIdx", -1899301124);
        setIntField(term207666, term207666.getClass(), "currRecIdx", -1882480155);
        setField(term207661, term207661.getClass(), "buffer", term207666);
        setIntField(term207661, term207661.getClass(), "longFileMode", -1410220680);
        setIntField(term207661, term207661.getClass(), "bigNumberMode", 389427431);
        setBooleanField(term207661, term207661.getClass(), "closed", false);
        setBooleanField(term207661, term207661.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term207661, term207661.getClass(), "finished", false);
        setField(term207661, term207661.getClass(), "out", null);
        setField(term207661, term207661.getClass(), "encoding", null);
        setBooleanField(term207661, term207661.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term207668, 0, (byte) 100);
        setByteElement(term207668, 1, (byte) 55);
        setByteElement(term207668, 2, (byte) -111);
        setByteElement(term207668, 3, (byte) -127);
        setByteElement(term207668, 4, (byte) 19);
        setField(term207661, term207661.getClass(), "oneByte", term207668);
        setLongField(term207661, term207661.getClass(), "bytesWritten", -7738503207562305297L);
        term207669 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = term2113;
        args[1] = "nyiiPDVjAc";
        args[2] = term2131;
        args[3] = term2133;
        callMethod(klass, "addPaxHeaderForBigNumber", argTypes, term2056, args);
        assertTrue(recursiveEquals(term2056, term207661));
        assertTrue(recursiveEquals(term2113, term207669));
        assertTrue(recursiveEquals(term2131, 3825396310311739952L));
        assertTrue(recursiveEquals(term2133, -3838084482494604218L));
    }

};


