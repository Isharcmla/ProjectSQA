package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_selectFirst_2005301264259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65877;

    public Element_selectFirst_2005301264259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term66013 = new ArrayList();
        term65877 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term65923 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term65923, term65923.getClass(), "tagName", "");
        setField(term65877, term65877.getClass(), "tag", term65923);
        setField(term65877, term65877.getClass(), "childNodes", term66013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "04L33zK304";
        callMethod(klass, "selectFirst", argTypes, term65877, args);
    }

};


