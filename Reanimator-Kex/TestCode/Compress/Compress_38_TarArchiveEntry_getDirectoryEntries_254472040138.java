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

public class TarArchiveEntry_getDirectoryEntries_254472040138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13190;
     Object term42694;
     Object term42629;

    public TarArchiveEntry_getDirectoryEntries_254472040138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42735 = Class.forName((String) "java.io.File$PathStatus");
        Field term42734 = ((Class) term42735).getDeclaredField((String) "INVALID");
        ((Field) term42734).setAccessible(true);
        Object enum182 = ((Field) term42734).get((Object) null);
        term13190 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13229 = newInstance(Class.forName("java.io.File"));
        setField(term13190, term13190.getClass(), "name", "");
        setBooleanField(term13190, term13190.getClass(), "preserveLeadingSlashes", false);
        setIntField(term13190, term13190.getClass(), "mode", 1045547089);
        setLongField(term13190, term13190.getClass(), "userId", 24067105862153728L);
        setLongField(term13190, term13190.getClass(), "groupId", -8477368071089201577L);
        setLongField(term13190, term13190.getClass(), "size", -1526729287349763895L);
        setLongField(term13190, term13190.getClass(), "modTime", 7017605765544766728L);
        setBooleanField(term13190, term13190.getClass(), "checkSumOK", true);
        setByteField(term13190, term13190.getClass(), "linkFlag", (byte) -89);
        setField(term13190, term13190.getClass(), "linkName", "");
        setField(term13190, term13190.getClass(), "magic", "ustar ");
        setField(term13190, term13190.getClass(), "version", "00");
        setField(term13190, term13190.getClass(), "userName", "root");
        setField(term13190, term13190.getClass(), "groupName", "");
        setIntField(term13190, term13190.getClass(), "devMajor", -1122880881);
        setIntField(term13190, term13190.getClass(), "devMinor", -542712742);
        setBooleanField(term13190, term13190.getClass(), "isExtended", true);
        setLongField(term13190, term13190.getClass(), "realSize", -6078481855513028760L);
        setBooleanField(term13190, term13190.getClass(), "paxGNUSparse", true);
        setBooleanField(term13190, term13190.getClass(), "starSparse", true);
        setField(term13229, term13229.getClass(), "path", "bLPjGVBhlX");
        setField(term13229, term13229.getClass(), "status", enum182);
        setIntField(term13229, term13229.getClass(), "prefixLength", -1254072822);
        setField(term13229, term13229.getClass(), "filePath", null);
        setField(term13190, term13190.getClass(), "file", term13229);
        Class<? extends Object> term42900 = Class.forName((String) "java.io.File$PathStatus");
        Field term42899 = ((Class) term42900).getDeclaredField((String) "INVALID");
        ((Field) term42899).setAccessible(true);
        Object enum183 = ((Field) term42899).get((Object) null);
        term42694 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term42707 = newInstance(Class.forName("java.io.File"));
        setField(term42694, term42694.getClass(), "name", "");
        setBooleanField(term42694, term42694.getClass(), "preserveLeadingSlashes", false);
        setIntField(term42694, term42694.getClass(), "mode", 1045547089);
        setLongField(term42694, term42694.getClass(), "userId", 24067105862153728L);
        setLongField(term42694, term42694.getClass(), "groupId", -8477368071089201577L);
        setLongField(term42694, term42694.getClass(), "size", -1526729287349763895L);
        setLongField(term42694, term42694.getClass(), "modTime", 7017605765544766728L);
        setBooleanField(term42694, term42694.getClass(), "checkSumOK", true);
        setByteField(term42694, term42694.getClass(), "linkFlag", (byte) -89);
        setField(term42694, term42694.getClass(), "linkName", "");
        setField(term42694, term42694.getClass(), "magic", "ustar ");
        setField(term42694, term42694.getClass(), "version", "00");
        setField(term42694, term42694.getClass(), "userName", "root");
        setField(term42694, term42694.getClass(), "groupName", "");
        setIntField(term42694, term42694.getClass(), "devMajor", -1122880881);
        setIntField(term42694, term42694.getClass(), "devMinor", -542712742);
        setBooleanField(term42694, term42694.getClass(), "isExtended", true);
        setLongField(term42694, term42694.getClass(), "realSize", -6078481855513028760L);
        setBooleanField(term42694, term42694.getClass(), "paxGNUSparse", true);
        setBooleanField(term42694, term42694.getClass(), "starSparse", true);
        setField(term42707, term42707.getClass(), "path", "bLPjGVBhlX");
        setField(term42707, term42707.getClass(), "status", enum183);
        setIntField(term42707, term42707.getClass(), "prefixLength", -1254072822);
        setField(term42707, term42707.getClass(), "filePath", null);
        setField(term42694, term42694.getClass(), "file", term42707);
        term42629 = (Object[]) newArray("org.apache.commons.compress.archivers.tar.TarArchiveEntry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDirectoryEntries", argTypes, term13190, args);
        assertTrue(recursiveEquals(term13190, term42694));
        assertTrue(recursiveEquals(retValue, term42629));
    }

};


