package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_removeChild_1104348502242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1979;
     Object term2006;

    public NodeUtil_removeChild_1104348502242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1979, term1979.getClass(), "type", 452088587);
        setIntField(term1981, term1981.getClass(), "type", -1630069454);
        setIntField(term1983, term1983.getClass(), "type", 1499735894);
        setIntField(term1985, term1985.getClass(), "type", 716486048);
        setIntField(term1987, term1987.getClass(), "type", -466708718);
        setField(term1987, term1987.getClass(), "next", null);
        setField(term1987, term1987.getClass(), "first", null);
        setField(term1987, term1987.getClass(), "last", null);
        setField(term1987, term1987.getClass(), "propListHead", null);
        setIntField(term1987, term1987.getClass(), "sourcePosition", 0);
        setField(term1987, term1987.getClass(), "jsType", null);
        setField(term1987, term1987.getClass(), "parent", null);
        setField(term1985, term1985.getClass(), "next", term1987);
        setIntField(term1990, term1990.getClass(), "type", 1038029515);
        setField(term1990, term1990.getClass(), "next", null);
        setField(term1990, term1990.getClass(), "first", null);
        setField(term1990, term1990.getClass(), "last", term1987);
        setField(term1990, term1990.getClass(), "propListHead", null);
        setIntField(term1990, term1990.getClass(), "sourcePosition", 0);
        setField(term1990, term1990.getClass(), "jsType", null);
        setField(term1990, term1990.getClass(), "parent", null);
        setField(term1985, term1985.getClass(), "first", term1990);
        setField(term1985, term1985.getClass(), "last", term1983);
        setField(term1985, term1985.getClass(), "propListHead", null);
        setIntField(term1985, term1985.getClass(), "sourcePosition", 0);
        setField(term1985, term1985.getClass(), "jsType", null);
        setField(term1985, term1985.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "next", term1985);
        setField(term1983, term1983.getClass(), "first", term1987);
        setIntField(term1994, term1994.getClass(), "type", -100681578);
        setIntField(term1996, term1996.getClass(), "type", 296568835);
        setField(term1996, term1996.getClass(), "next", null);
        setField(term1996, term1996.getClass(), "first", term1990);
        setField(term1996, term1996.getClass(), "last", term1985);
        setField(term1996, term1996.getClass(), "propListHead", null);
        setIntField(term1996, term1996.getClass(), "sourcePosition", 0);
        setField(term1996, term1996.getClass(), "jsType", null);
        setField(term1996, term1996.getClass(), "parent", null);
        setField(term1994, term1994.getClass(), "next", term1996);
        setField(term1994, term1994.getClass(), "first", term1981);
        setField(term1994, term1994.getClass(), "last", term1981);
        setField(term1994, term1994.getClass(), "propListHead", null);
        setIntField(term1994, term1994.getClass(), "sourcePosition", 0);
        setField(term1994, term1994.getClass(), "jsType", null);
        setField(term1994, term1994.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "last", term1994);
        setField(term1983, term1983.getClass(), "propListHead", null);
        setIntField(term1983, term1983.getClass(), "sourcePosition", 0);
        setField(term1983, term1983.getClass(), "jsType", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "next", term1983);
        setIntField(term2001, term2001.getClass(), "type", 1431951992);
        setField(term2001, term2001.getClass(), "next", term1994);
        setField(term2001, term2001.getClass(), "first", term1996);
        setField(term2001, term2001.getClass(), "last", term1979);
        setField(term2001, term2001.getClass(), "propListHead", null);
        setIntField(term2001, term2001.getClass(), "sourcePosition", 0);
        setField(term2001, term2001.getClass(), "jsType", null);
        setField(term2001, term2001.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "first", term2001);
        setField(term1981, term1981.getClass(), "last", term2001);
        setField(term1981, term1981.getClass(), "propListHead", null);
        setIntField(term1981, term1981.getClass(), "sourcePosition", 0);
        setField(term1981, term1981.getClass(), "jsType", null);
        setField(term1981, term1981.getClass(), "parent", null);
        setField(term1979, term1979.getClass(), "next", term1981);
        setField(term1979, term1979.getClass(), "first", term1985);
        setField(term1979, term1979.getClass(), "last", term1987);
        setField(term1979, term1979.getClass(), "propListHead", null);
        setIntField(term1979, term1979.getClass(), "sourcePosition", 0);
        setField(term1979, term1979.getClass(), "jsType", null);
        setField(term1979, term1979.getClass(), "parent", null);
        term2006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2006, term2006.getClass(), "type", -1608123016);
        setIntField(term2008, term2008.getClass(), "type", -896473214);
        setIntField(term2010, term2010.getClass(), "type", 401203924);
        setIntField(term2012, term2012.getClass(), "type", -1212399479);
        setIntField(term2014, term2014.getClass(), "type", 2107679041);
        setField(term2014, term2014.getClass(), "next", null);
        setField(term2014, term2014.getClass(), "first", null);
        setField(term2014, term2014.getClass(), "last", null);
        setField(term2014, term2014.getClass(), "propListHead", null);
        setIntField(term2014, term2014.getClass(), "sourcePosition", 0);
        setField(term2014, term2014.getClass(), "jsType", null);
        setField(term2014, term2014.getClass(), "parent", null);
        setField(term2012, term2012.getClass(), "next", term2014);
        setIntField(term2017, term2017.getClass(), "type", 2040965507);
        setField(term2017, term2017.getClass(), "next", null);
        setField(term2017, term2017.getClass(), "first", null);
        setField(term2017, term2017.getClass(), "last", term2014);
        setField(term2017, term2017.getClass(), "propListHead", null);
        setIntField(term2017, term2017.getClass(), "sourcePosition", 0);
        setField(term2017, term2017.getClass(), "jsType", null);
        setField(term2017, term2017.getClass(), "parent", null);
        setField(term2012, term2012.getClass(), "first", term2017);
        setField(term2012, term2012.getClass(), "last", term2010);
        setField(term2012, term2012.getClass(), "propListHead", null);
        setIntField(term2012, term2012.getClass(), "sourcePosition", 0);
        setField(term2012, term2012.getClass(), "jsType", null);
        setField(term2012, term2012.getClass(), "parent", null);
        setField(term2010, term2010.getClass(), "next", term2012);
        setField(term2010, term2010.getClass(), "first", term2014);
        setIntField(term2021, term2021.getClass(), "type", 1059930704);
        setIntField(term2023, term2023.getClass(), "type", -1967153290);
        setField(term2023, term2023.getClass(), "next", null);
        setField(term2023, term2023.getClass(), "first", term2017);
        setField(term2023, term2023.getClass(), "last", term2012);
        setField(term2023, term2023.getClass(), "propListHead", null);
        setIntField(term2023, term2023.getClass(), "sourcePosition", 0);
        setField(term2023, term2023.getClass(), "jsType", null);
        setField(term2023, term2023.getClass(), "parent", null);
        setField(term2021, term2021.getClass(), "next", term2023);
        setField(term2021, term2021.getClass(), "first", term2008);
        setField(term2021, term2021.getClass(), "last", term2008);
        setField(term2021, term2021.getClass(), "propListHead", null);
        setIntField(term2021, term2021.getClass(), "sourcePosition", 0);
        setField(term2021, term2021.getClass(), "jsType", null);
        setField(term2021, term2021.getClass(), "parent", null);
        setField(term2010, term2010.getClass(), "last", term2021);
        setField(term2010, term2010.getClass(), "propListHead", null);
        setIntField(term2010, term2010.getClass(), "sourcePosition", 0);
        setField(term2010, term2010.getClass(), "jsType", null);
        setField(term2010, term2010.getClass(), "parent", null);
        setField(term2008, term2008.getClass(), "next", term2010);
        setIntField(term2028, term2028.getClass(), "type", -1397251956);
        setField(term2028, term2028.getClass(), "next", term2021);
        setField(term2028, term2028.getClass(), "first", term2023);
        setField(term2028, term2028.getClass(), "last", term2006);
        setField(term2028, term2028.getClass(), "propListHead", null);
        setIntField(term2028, term2028.getClass(), "sourcePosition", 0);
        setField(term2028, term2028.getClass(), "jsType", null);
        setField(term2028, term2028.getClass(), "parent", null);
        setField(term2008, term2008.getClass(), "first", term2028);
        setField(term2008, term2008.getClass(), "last", term2028);
        setField(term2008, term2008.getClass(), "propListHead", null);
        setIntField(term2008, term2008.getClass(), "sourcePosition", 0);
        setField(term2008, term2008.getClass(), "jsType", null);
        setField(term2008, term2008.getClass(), "parent", null);
        setField(term2006, term2006.getClass(), "next", term2008);
        setField(term2006, term2006.getClass(), "first", term2012);
        setField(term2006, term2006.getClass(), "last", term2014);
        setField(term2006, term2006.getClass(), "propListHead", null);
        setIntField(term2006, term2006.getClass(), "sourcePosition", 0);
        setField(term2006, term2006.getClass(), "jsType", null);
        setField(term2006, term2006.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1979;
        args[1] = term2006;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


