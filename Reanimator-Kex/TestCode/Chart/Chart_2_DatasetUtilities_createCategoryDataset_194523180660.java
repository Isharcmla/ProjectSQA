package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.general.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DatasetUtilities_createCategoryDataset_194523180660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term7517;
     Object term2319;

    public DatasetUtilities_createCategoryDataset_194523180660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = (Object[]) newArray("[D", 5);
        double[] term36 = (double[]) newDoubleArray(4);
        double[] term41 = (double[]) newDoubleArray(3);
        double[] term45 = (double[]) newDoubleArray(4);
        double[] term50 = (double[]) newDoubleArray(1);
        double[] term52 = (double[]) newDoubleArray(6);
        setDoubleElement(term36, 0, 0.5523635872663106);
        setDoubleElement(term36, 1, 0.544608645520025);
        setDoubleElement(term36, 2, 0.28570734989730284);
        setDoubleElement(term36, 3, 0.40176586625454525);
        setElement(term35, 0, term36);
        setDoubleElement(term41, 0, 0.2641345529914265);
        setDoubleElement(term41, 1, 0.36923381893433327);
        setDoubleElement(term41, 2, 0.6076495596892013);
        setElement(term35, 1, term41);
        setDoubleElement(term45, 0, 0.37773193782763337);
        setDoubleElement(term45, 1, 0.8474802076607362);
        setDoubleElement(term45, 2, 0.5183269973490326);
        setDoubleElement(term45, 3, 0.7655020693602768);
        setElement(term35, 2, term45);
        setDoubleElement(term50, 0, 0.1374549299694151);
        setElement(term35, 3, term50);
        setDoubleElement(term52, 0, 0.7031006357544823);
        setDoubleElement(term52, 1, 0.9527281779865117);
        setDoubleElement(term52, 2, 0.9828442029246764);
        setDoubleElement(term52, 3, 0.2779719046761513);
        setDoubleElement(term52, 4, 0.6436713023569729);
        setDoubleElement(term52, 5, 0.7332741045694002);
        setElement(term35, 4, term52);
        term7517 = (Object[]) newArray("[D", 5);
        double[] term7518 = (double[]) newDoubleArray(4);
        double[] term7519 = (double[]) newDoubleArray(3);
        double[] term7520 = (double[]) newDoubleArray(4);
        double[] term7521 = (double[]) newDoubleArray(1);
        double[] term7522 = (double[]) newDoubleArray(6);
        setDoubleElement(term7518, 0, 0.5523635872663106);
        setDoubleElement(term7518, 1, 0.544608645520025);
        setDoubleElement(term7518, 2, 0.28570734989730284);
        setDoubleElement(term7518, 3, 0.40176586625454525);
        setElement(term7517, 0, term7518);
        setDoubleElement(term7519, 0, 0.2641345529914265);
        setDoubleElement(term7519, 1, 0.36923381893433327);
        setDoubleElement(term7519, 2, 0.6076495596892013);
        setElement(term7517, 1, term7519);
        setDoubleElement(term7520, 0, 0.37773193782763337);
        setDoubleElement(term7520, 1, 0.8474802076607362);
        setDoubleElement(term7520, 2, 0.5183269973490326);
        setDoubleElement(term7520, 3, 0.7655020693602768);
        setElement(term7517, 2, term7520);
        setDoubleElement(term7521, 0, 0.1374549299694151);
        setElement(term7517, 3, term7521);
        setDoubleElement(term7522, 0, 0.7031006357544823);
        setDoubleElement(term7522, 1, 0.9527281779865117);
        setDoubleElement(term7522, 2, 0.9828442029246764);
        setDoubleElement(term7522, 3, 0.2779719046761513);
        setDoubleElement(term7522, 4, 0.6436713023569729);
        setDoubleElement(term7522, 5, 0.7332741045694002);
        setElement(term7517, 4, term7522);
        ArrayList term2321 = new ArrayList();
        ((ArrayList) term2321).add("");
        ((ArrayList) term2321).add("");
        ((ArrayList) term2321).add("");
        ((ArrayList) term2321).add("");
        ((ArrayList) term2321).add("");
        ArrayList term2330 = new ArrayList();
        ((ArrayList) term2330).add("");
        ((ArrayList) term2330).add("");
        ((ArrayList) term2330).add("");
        ((ArrayList) term2330).add("");
        ((ArrayList) term2330).add("");
        ((ArrayList) term2330).add("");
        Object term2342 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term2342, term2342.getClass(), "data", null);
        Object term2343 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term2343, term2343.getClass(), "data", null);
        Object term2344 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term2344, term2344.getClass(), "data", null);
        Object term2345 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term2345, term2345.getClass(), "data", null);
        Object term2346 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term2346, term2346.getClass(), "data", null);
        ArrayList term2340 = new ArrayList();
        ((ArrayList) term2340).add(term2342);
        ((ArrayList) term2340).add(term2343);
        ((ArrayList) term2340).add(term2344);
        ((ArrayList) term2340).add(term2345);
        ((ArrayList) term2340).add(term2346);
        term2319 = newInstance(Class.forName("org.jfree.data.category.DefaultCategoryDataset"));
        Object term2320 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term2349 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term2356 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2357 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2320, term2320.getClass(), "rowKeys", term2321);
        setField(term2320, term2320.getClass(), "columnKeys", term2330);
        setField(term2320, term2320.getClass(), "rows", term2340);
        setField(term2319, term2319.getClass(), "data", term2320);
        setField(term2319, term2319.getClass(), "selectionState", term2319);
        setField(term2349, term2349.getClass(), "id", "NOID");
        setField(term2319, term2319.getClass(), "group", term2349);
        setField(term2356, term2356.getClass(), "listenerList", term2357);
        setField(term2319, term2319.getClass(), "listenerList", term2356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term35;
        Object retValue = callMethod(klass, "createCategoryDataset", argTypes, null, args);
        assertTrue(recursiveEquals(term35, term7517));
        assertTrue(recursiveEquals(retValue, term2319));
    }

};


