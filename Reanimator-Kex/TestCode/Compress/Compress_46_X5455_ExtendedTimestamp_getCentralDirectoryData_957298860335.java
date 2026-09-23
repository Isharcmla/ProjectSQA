package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69614;
     Object term69647;
     Object term69645;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69614 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term69614, term69614.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term69614, term69614.getClass(), "bit1_accessTimePresent", true);
        setField(term69614, term69614.getClass(), "accessTime", null);
        setBooleanField(term69614, term69614.getClass(), "bit2_createTimePresent", true);
        term69647 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term69647, term69647.getClass(), "flags", (byte) 0);
        setBooleanField(term69647, term69647.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term69647, term69647.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term69647, term69647.getClass(), "bit2_createTimePresent", true);
        setField(term69647, term69647.getClass(), "modifyTime", null);
        setField(term69647, term69647.getClass(), "accessTime", null);
        setField(term69647, term69647.getClass(), "createTime", null);
        term69645 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term69614, args);
        assertTrue(recursiveEquals(term69614, term69647));
        assertTrue(recursiveEquals(retValue, term69645));
    }

};


