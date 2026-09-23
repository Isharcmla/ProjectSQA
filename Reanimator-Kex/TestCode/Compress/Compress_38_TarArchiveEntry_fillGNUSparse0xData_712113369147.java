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
import java.lang.NumberFormatException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class TarArchiveEntry_fillGNUSparse0xData_712113369147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15123;
     Object term15187;

    public TarArchiveEntry_fillGNUSparse0xData_712113369147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46462 = Class.forName((String) "java.io.File$PathStatus");
        Field term46461 = ((Class) term46462).getDeclaredField((String) "CHECKED");
        ((Field) term46461).setAccessible(true);
        Object enum190 = ((Field) term46461).get((Object) null);
        term15123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15162 = newInstance(Class.forName("java.io.File"));
        setField(term15123, term15123.getClass(), "name", "");
        setBooleanField(term15123, term15123.getClass(), "preserveLeadingSlashes", true);
        setIntField(term15123, term15123.getClass(), "mode", 515182546);
        setLongField(term15123, term15123.getClass(), "userId", 5797412846146719084L);
        setLongField(term15123, term15123.getClass(), "groupId", 5319740127125920367L);
        setLongField(term15123, term15123.getClass(), "size", 6465987664600701876L);
        setLongField(term15123, term15123.getClass(), "modTime", -136372844051852955L);
        setBooleanField(term15123, term15123.getClass(), "checkSumOK", false);
        setByteField(term15123, term15123.getClass(), "linkFlag", (byte) 24);
        setField(term15123, term15123.getClass(), "linkName", "");
        setField(term15123, term15123.getClass(), "magic", "ustar ");
        setField(term15123, term15123.getClass(), "version", "00");
        setField(term15123, term15123.getClass(), "userName", "root");
        setField(term15123, term15123.getClass(), "groupName", "");
        setIntField(term15123, term15123.getClass(), "devMajor", -936895502);
        setIntField(term15123, term15123.getClass(), "devMinor", -129547140);
        setBooleanField(term15123, term15123.getClass(), "isExtended", true);
        setLongField(term15123, term15123.getClass(), "realSize", -7632759764262745126L);
        setBooleanField(term15123, term15123.getClass(), "paxGNUSparse", true);
        setBooleanField(term15123, term15123.getClass(), "starSparse", false);
        setField(term15162, term15162.getClass(), "path", "OWKQODBLzb");
        setField(term15162, term15162.getClass(), "status", enum190);
        setIntField(term15162, term15162.getClass(), "prefixLength", 199287428);
        setField(term15162, term15162.getClass(), "filePath", null);
        setField(term15123, term15123.getClass(), "file", term15162);
        term15187 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term15187;
        try {
            callMethod(klass, "fillGNUSparse0xData", argTypes, term15123, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


