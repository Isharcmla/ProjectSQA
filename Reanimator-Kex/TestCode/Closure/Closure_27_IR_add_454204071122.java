package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_add_454204071122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;
     Object term2020;

    public IR_add_454204071122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1993, term1993.getClass(), "type", 808614267);
        setIntField(term1995, term1995.getClass(), "type", 1611734632);
        setIntField(term1997, term1997.getClass(), "type", 868908117);
        setIntField(term1999, term1999.getClass(), "type", 1789351397);
        setIntField(term2001, term2001.getClass(), "type", 2145528170);
        setField(term2001, term2001.getClass(), "next", null);
        setField(term2001, term2001.getClass(), "first", null);
        setField(term2001, term2001.getClass(), "last", null);
        setField(term2001, term2001.getClass(), "propListHead", null);
        setIntField(term2001, term2001.getClass(), "sourcePosition", 0);
        setField(term2001, term2001.getClass(), "jsType", null);
        setField(term2001, term2001.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "next", term2001);
        setIntField(term2004, term2004.getClass(), "type", -585773976);
        setField(term2004, term2004.getClass(), "next", null);
        setField(term2004, term2004.getClass(), "first", null);
        setField(term2004, term2004.getClass(), "last", term2001);
        setField(term2004, term2004.getClass(), "propListHead", null);
        setIntField(term2004, term2004.getClass(), "sourcePosition", 0);
        setField(term2004, term2004.getClass(), "jsType", null);
        setField(term2004, term2004.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "first", term2004);
        setField(term1999, term1999.getClass(), "last", term1997);
        setField(term1999, term1999.getClass(), "propListHead", null);
        setIntField(term1999, term1999.getClass(), "sourcePosition", 0);
        setField(term1999, term1999.getClass(), "jsType", null);
        setField(term1999, term1999.getClass(), "parent", null);
        setField(term1997, term1997.getClass(), "next", term1999);
        setField(term1997, term1997.getClass(), "first", term2001);
        setIntField(term2008, term2008.getClass(), "type", 698551724);
        setIntField(term2010, term2010.getClass(), "type", -1631048635);
        setField(term2010, term2010.getClass(), "next", null);
        setField(term2010, term2010.getClass(), "first", term2004);
        setField(term2010, term2010.getClass(), "last", term1999);
        setField(term2010, term2010.getClass(), "propListHead", null);
        setIntField(term2010, term2010.getClass(), "sourcePosition", 0);
        setField(term2010, term2010.getClass(), "jsType", null);
        setField(term2010, term2010.getClass(), "parent", null);
        setField(term2008, term2008.getClass(), "next", term2010);
        setField(term2008, term2008.getClass(), "first", term1995);
        setField(term2008, term2008.getClass(), "last", term1995);
        setField(term2008, term2008.getClass(), "propListHead", null);
        setIntField(term2008, term2008.getClass(), "sourcePosition", 0);
        setField(term2008, term2008.getClass(), "jsType", null);
        setField(term2008, term2008.getClass(), "parent", null);
        setField(term1997, term1997.getClass(), "last", term2008);
        setField(term1997, term1997.getClass(), "propListHead", null);
        setIntField(term1997, term1997.getClass(), "sourcePosition", 0);
        setField(term1997, term1997.getClass(), "jsType", null);
        setField(term1997, term1997.getClass(), "parent", null);
        setField(term1995, term1995.getClass(), "next", term1997);
        setIntField(term2015, term2015.getClass(), "type", 1342808731);
        setField(term2015, term2015.getClass(), "next", term2008);
        setField(term2015, term2015.getClass(), "first", term2010);
        setField(term2015, term2015.getClass(), "last", term1993);
        setField(term2015, term2015.getClass(), "propListHead", null);
        setIntField(term2015, term2015.getClass(), "sourcePosition", 0);
        setField(term2015, term2015.getClass(), "jsType", null);
        setField(term2015, term2015.getClass(), "parent", null);
        setField(term1995, term1995.getClass(), "first", term2015);
        setField(term1995, term1995.getClass(), "last", term2015);
        setField(term1995, term1995.getClass(), "propListHead", null);
        setIntField(term1995, term1995.getClass(), "sourcePosition", 0);
        setField(term1995, term1995.getClass(), "jsType", null);
        setField(term1995, term1995.getClass(), "parent", null);
        setField(term1993, term1993.getClass(), "next", term1995);
        setField(term1993, term1993.getClass(), "first", term1999);
        setField(term1993, term1993.getClass(), "last", term2001);
        setField(term1993, term1993.getClass(), "propListHead", null);
        setIntField(term1993, term1993.getClass(), "sourcePosition", 0);
        setField(term1993, term1993.getClass(), "jsType", null);
        setField(term1993, term1993.getClass(), "parent", null);
        term2020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2020, term2020.getClass(), "type", -64893740);
        setIntField(term2022, term2022.getClass(), "type", -222012928);
        setIntField(term2024, term2024.getClass(), "type", -146564963);
        setIntField(term2026, term2026.getClass(), "type", -83178716);
        setIntField(term2028, term2028.getClass(), "type", -1292704466);
        setField(term2028, term2028.getClass(), "next", null);
        setField(term2028, term2028.getClass(), "first", null);
        setField(term2028, term2028.getClass(), "last", null);
        setField(term2028, term2028.getClass(), "propListHead", null);
        setIntField(term2028, term2028.getClass(), "sourcePosition", 0);
        setField(term2028, term2028.getClass(), "jsType", null);
        setField(term2028, term2028.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "next", term2028);
        setIntField(term2031, term2031.getClass(), "type", 1991858584);
        setField(term2031, term2031.getClass(), "next", null);
        setField(term2031, term2031.getClass(), "first", null);
        setField(term2031, term2031.getClass(), "last", term2028);
        setField(term2031, term2031.getClass(), "propListHead", null);
        setIntField(term2031, term2031.getClass(), "sourcePosition", 0);
        setField(term2031, term2031.getClass(), "jsType", null);
        setField(term2031, term2031.getClass(), "parent", null);
        setField(term2026, term2026.getClass(), "first", term2031);
        setField(term2026, term2026.getClass(), "last", term2024);
        setField(term2026, term2026.getClass(), "propListHead", null);
        setIntField(term2026, term2026.getClass(), "sourcePosition", 0);
        setField(term2026, term2026.getClass(), "jsType", null);
        setField(term2026, term2026.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "next", term2026);
        setField(term2024, term2024.getClass(), "first", term2028);
        setIntField(term2035, term2035.getClass(), "type", 188512644);
        setIntField(term2037, term2037.getClass(), "type", 1851127634);
        setField(term2037, term2037.getClass(), "next", null);
        setField(term2037, term2037.getClass(), "first", term2031);
        setField(term2037, term2037.getClass(), "last", term2026);
        setField(term2037, term2037.getClass(), "propListHead", null);
        setIntField(term2037, term2037.getClass(), "sourcePosition", 0);
        setField(term2037, term2037.getClass(), "jsType", null);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2035, term2035.getClass(), "next", term2037);
        setField(term2035, term2035.getClass(), "first", term2022);
        setField(term2035, term2035.getClass(), "last", term2022);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "last", term2035);
        setField(term2024, term2024.getClass(), "propListHead", null);
        setIntField(term2024, term2024.getClass(), "sourcePosition", 0);
        setField(term2024, term2024.getClass(), "jsType", null);
        setField(term2024, term2024.getClass(), "parent", null);
        setField(term2022, term2022.getClass(), "next", term2024);
        setIntField(term2042, term2042.getClass(), "type", 783730213);
        setField(term2042, term2042.getClass(), "next", term2035);
        setField(term2042, term2042.getClass(), "first", term2037);
        setField(term2042, term2042.getClass(), "last", term2020);
        setField(term2042, term2042.getClass(), "propListHead", null);
        setIntField(term2042, term2042.getClass(), "sourcePosition", 0);
        setField(term2042, term2042.getClass(), "jsType", null);
        setField(term2042, term2042.getClass(), "parent", null);
        setField(term2022, term2022.getClass(), "first", term2042);
        setField(term2022, term2022.getClass(), "last", term2042);
        setField(term2022, term2022.getClass(), "propListHead", null);
        setIntField(term2022, term2022.getClass(), "sourcePosition", 0);
        setField(term2022, term2022.getClass(), "jsType", null);
        setField(term2022, term2022.getClass(), "parent", null);
        setField(term2020, term2020.getClass(), "next", term2022);
        setField(term2020, term2020.getClass(), "first", term2026);
        setField(term2020, term2020.getClass(), "last", term2028);
        setField(term2020, term2020.getClass(), "propListHead", null);
        setIntField(term2020, term2020.getClass(), "sourcePosition", 0);
        setField(term2020, term2020.getClass(), "jsType", null);
        setField(term2020, term2020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1993;
        args[1] = term2020;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


