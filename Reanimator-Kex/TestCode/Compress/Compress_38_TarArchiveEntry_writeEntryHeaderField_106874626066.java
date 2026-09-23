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
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class TarArchiveEntry_writeEntryHeaderField_106874626066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13895;
     Object term13959;
     Object term13961;
     Object term13963;
     Object term13965;
     Object term13967;

    public TarArchiveEntry_writeEntryHeaderField_106874626066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13992 = Class.forName((String) "java.io.File$PathStatus");
        Field term13991 = ((Class) term13992).getDeclaredField((String) "INVALID");
        ((Field) term13991).setAccessible(true);
        Object enum59 = ((Field) term13991).get((Object) null);
        term13895 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13934 = newInstance(Class.forName("java.io.File"));
        setField(term13895, term13895.getClass(), "name", "");
        setBooleanField(term13895, term13895.getClass(), "preserveLeadingSlashes", false);
        setIntField(term13895, term13895.getClass(), "mode", 477625804);
        setLongField(term13895, term13895.getClass(), "userId", -1964501434345816975L);
        setLongField(term13895, term13895.getClass(), "groupId", 4689907154423223972L);
        setLongField(term13895, term13895.getClass(), "size", 8512025621149521819L);
        setLongField(term13895, term13895.getClass(), "modTime", 2022482096970820459L);
        setBooleanField(term13895, term13895.getClass(), "checkSumOK", false);
        setByteField(term13895, term13895.getClass(), "linkFlag", (byte) 14);
        setField(term13895, term13895.getClass(), "linkName", "");
        setField(term13895, term13895.getClass(), "magic", "ustar ");
        setField(term13895, term13895.getClass(), "version", "00");
        setField(term13895, term13895.getClass(), "userName", "root");
        setField(term13895, term13895.getClass(), "groupName", "");
        setIntField(term13895, term13895.getClass(), "devMajor", 252575029);
        setIntField(term13895, term13895.getClass(), "devMinor", 57189932);
        setBooleanField(term13895, term13895.getClass(), "isExtended", true);
        setLongField(term13895, term13895.getClass(), "realSize", 6315101499811179240L);
        setBooleanField(term13895, term13895.getClass(), "paxGNUSparse", true);
        setBooleanField(term13895, term13895.getClass(), "starSparse", true);
        setField(term13934, term13934.getClass(), "path", "JUmudUmaaV");
        setField(term13934, term13934.getClass(), "status", enum59);
        setIntField(term13934, term13934.getClass(), "prefixLength", 1460722225);
        setField(term13934, term13934.getClass(), "filePath", null);
        setField(term13895, term13895.getClass(), "file", term13934);
        term13959 = new Long(-3033337370154155851L);
        term13961 = (byte[]) newByteArray(1);
        setByteElement(term13961, 0, (byte) -101);
        term13963 = new Integer(1743224434);
        term13965 = new Integer(842904495);
        term13967 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term13959;
        args[1] = term13961;
        args[2] = term13963;
        args[3] = term13965;
        args[4] = term13967;
        callMethod(klass, "writeEntryHeaderField", argTypes, term13895, args);
    }

};


