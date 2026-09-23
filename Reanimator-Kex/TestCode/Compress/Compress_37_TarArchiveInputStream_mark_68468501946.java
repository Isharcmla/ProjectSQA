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
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class TarArchiveInputStream_mark_68468501946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523;
     Object term1611;
     Object term15511;

    public TarArchiveInputStream_mark_68468501946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15558 = Class.forName((String) "java.io.File$PathStatus");
        Field term15557 = ((Class) term15558).getDeclaredField((String) "INVALID");
        ((Field) term15557).setAccessible(true);
        Object enum38 = ((Field) term15557).get((Object) null);
        HashMap term1599 = new HashMap();
        term1523 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1524 = (byte[]) newByteArray(1);
        Object term1531 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1570 = newInstance(Class.forName("java.io.File"));
        byte[] term1609 = (byte[]) newByteArray(0);
        setByteElement(term1524, 0, (byte) 116);
        setField(term1523, term1523.getClass(), "SMALL_BUF", term1524);
        setIntField(term1523, term1523.getClass(), "recordSize", -1530420153);
        setIntField(term1523, term1523.getClass(), "blockSize", -469968304);
        setBooleanField(term1523, term1523.getClass(), "hasHitEOF", true);
        setLongField(term1523, term1523.getClass(), "entrySize", -2068172595987555756L);
        setLongField(term1523, term1523.getClass(), "entryOffset", -6292278961887936280L);
        setField(term1523, term1523.getClass(), "is", null);
        setField(term1531, term1531.getClass(), "name", "");
        setBooleanField(term1531, term1531.getClass(), "preserveLeadingSlashes", true);
        setIntField(term1531, term1531.getClass(), "mode", -1145578966);
        setLongField(term1531, term1531.getClass(), "userId", -6645965768855543712L);
        setLongField(term1531, term1531.getClass(), "groupId", 4784595517102746672L);
        setLongField(term1531, term1531.getClass(), "size", -7612550318181586304L);
        setLongField(term1531, term1531.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term1531, term1531.getClass(), "checkSumOK", true);
        setByteField(term1531, term1531.getClass(), "linkFlag", (byte) -81);
        setField(term1531, term1531.getClass(), "linkName", "");
        setField(term1531, term1531.getClass(), "magic", "ustar ");
        setField(term1531, term1531.getClass(), "version", "00");
        setField(term1531, term1531.getClass(), "userName", "root");
        setField(term1531, term1531.getClass(), "groupName", "");
        setIntField(term1531, term1531.getClass(), "devMajor", 679763016);
        setIntField(term1531, term1531.getClass(), "devMinor", 1962444399);
        setBooleanField(term1531, term1531.getClass(), "isExtended", true);
        setLongField(term1531, term1531.getClass(), "realSize", 4044358158040652353L);
        setBooleanField(term1531, term1531.getClass(), "paxGNUSparse", false);
        setBooleanField(term1531, term1531.getClass(), "starSparse", true);
        setField(term1570, term1570.getClass(), "path", "eZFUvlxvGV");
        setField(term1570, term1570.getClass(), "status", enum38);
        setIntField(term1570, term1570.getClass(), "prefixLength", 767834723);
        setField(term1570, term1570.getClass(), "filePath", null);
        setField(term1531, term1531.getClass(), "file", term1570);
        setField(term1523, term1523.getClass(), "currEntry", term1531);
        setField(term1523, term1523.getClass(), "zipEncoding", null);
        setField(term1523, term1523.getClass(), "encoding", "BYqFIqCKAV");
        setField(term1523, term1523.getClass(), "globalPaxHeaders", term1599);
        setField(term1523, term1523.getClass(), "SINGLE", term1609);
        setLongField(term1523, term1523.getClass(), "bytesRead", -4443169559037975007L);
        term1611 = new Integer(-602026508);
        Class<? extends Object> term15734 = Class.forName((String) "java.io.File$PathStatus");
        Field term15733 = ((Class) term15734).getDeclaredField((String) "CHECKED");
        ((Field) term15733).setAccessible(true);
        Object enum39 = ((Field) term15733).get((Object) null);
        HashMap term15533 = new HashMap();
        term15511 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term15512 = (byte[]) newByteArray(1);
        Object term15513 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15526 = newInstance(Class.forName("java.io.File"));
        byte[] term15534 = (byte[]) newByteArray(0);
        setByteElement(term15512, 0, (byte) 116);
        setField(term15511, term15511.getClass(), "SMALL_BUF", term15512);
        setIntField(term15511, term15511.getClass(), "recordSize", -1530420153);
        setIntField(term15511, term15511.getClass(), "blockSize", -469968304);
        setBooleanField(term15511, term15511.getClass(), "hasHitEOF", true);
        setLongField(term15511, term15511.getClass(), "entrySize", -2068172595987555756L);
        setLongField(term15511, term15511.getClass(), "entryOffset", -6292278961887936280L);
        setField(term15511, term15511.getClass(), "is", null);
        setField(term15513, term15513.getClass(), "name", "");
        setBooleanField(term15513, term15513.getClass(), "preserveLeadingSlashes", true);
        setIntField(term15513, term15513.getClass(), "mode", -1145578966);
        setLongField(term15513, term15513.getClass(), "userId", -6645965768855543712L);
        setLongField(term15513, term15513.getClass(), "groupId", 4784595517102746672L);
        setLongField(term15513, term15513.getClass(), "size", -7612550318181586304L);
        setLongField(term15513, term15513.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term15513, term15513.getClass(), "checkSumOK", true);
        setByteField(term15513, term15513.getClass(), "linkFlag", (byte) -81);
        setField(term15513, term15513.getClass(), "linkName", "");
        setField(term15513, term15513.getClass(), "magic", "ustar ");
        setField(term15513, term15513.getClass(), "version", "00");
        setField(term15513, term15513.getClass(), "userName", "root");
        setField(term15513, term15513.getClass(), "groupName", "");
        setIntField(term15513, term15513.getClass(), "devMajor", 679763016);
        setIntField(term15513, term15513.getClass(), "devMinor", 1962444399);
        setBooleanField(term15513, term15513.getClass(), "isExtended", true);
        setLongField(term15513, term15513.getClass(), "realSize", 4044358158040652353L);
        setBooleanField(term15513, term15513.getClass(), "paxGNUSparse", false);
        setBooleanField(term15513, term15513.getClass(), "starSparse", true);
        setField(term15526, term15526.getClass(), "path", "eZFUvlxvGV");
        setField(term15526, term15526.getClass(), "status", enum39);
        setIntField(term15526, term15526.getClass(), "prefixLength", 767834723);
        setField(term15526, term15526.getClass(), "filePath", null);
        setField(term15513, term15513.getClass(), "file", term15526);
        setField(term15511, term15511.getClass(), "currEntry", term15513);
        setField(term15511, term15511.getClass(), "zipEncoding", null);
        setField(term15511, term15511.getClass(), "encoding", "BYqFIqCKAV");
        setField(term15511, term15511.getClass(), "globalPaxHeaders", term15533);
        setField(term15511, term15511.getClass(), "SINGLE", term15534);
        setLongField(term15511, term15511.getClass(), "bytesRead", -4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1611;
        callMethod(klass, "mark", argTypes, term1523, args);
        assertTrue(recursiveEquals(term1523, term15511));
        assertTrue(recursiveEquals(term1611, -602026508));
    }

};


