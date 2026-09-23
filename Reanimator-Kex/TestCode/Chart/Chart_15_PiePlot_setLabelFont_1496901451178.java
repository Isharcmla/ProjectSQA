package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PiePlot_setLabelFont_1496901451178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public PiePlot_setLabelFont_1496901451178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("java.awt.Font"));
        Object term66 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term67 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term68 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term70 = newInstance(Class.forName("java.lang.Object"));
        Object term71 = newInstance(Class.forName("java.lang.Object"));
        Object term97 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term99 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term100 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term68, term68.getClass(), "hash", 529268150);
        setField(term68, term68.getClass(), "key", term70);
        setField(term68, term68.getClass(), "value", term71);
        setField(term68, term68.getClass(), "next", null);
        setElement(term67, 4, term68);
        setField(term66, term66.getClass(), "table", term67);
        setIntField(term66, term66.getClass(), "count", 1);
        setIntField(term66, term66.getClass(), "threshold", 8);
        setFloatField(term66, term66.getClass(), "loadFactor", 0.75F);
        setIntField(term66, term66.getClass(), "modCount", 1);
        setField(term66, term66.getClass(), "keySet", null);
        setField(term66, term66.getClass(), "entrySet", null);
        setField(term66, term66.getClass(), "values", null);
        setField(term65, term65.getClass(), "fRequestedAttributes", term66);
        setField(term65, term65.getClass(), "name", "sjlJAEtRrb");
        setIntField(term65, term65.getClass(), "style", -616727354);
        setIntField(term65, term65.getClass(), "size", -1955890973);
        setFloatField(term65, term65.getClass(), "pointSize", 0.13238746F);
        setField(term65, term65.getClass(), "peer", null);
        setLongField(term65, term65.getClass(), "pData", 2442117782898005296L);
        setField(term65, term65.getClass(), "font2DHandle", null);
        setField(term65, term65.getClass(), "values", null);
        setBooleanField(term65, term65.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term65, term65.getClass(), "createdFont", true);
        setBooleanField(term65, term65.getClass(), "nonIdentityTx", false);
        setIntField(term65, term65.getClass(), "hash", -2038273078);
        setIntField(term65, term65.getClass(), "fontSerializedDataVersion", 1227103734);
        setLongField(term97, term97.getClass(), "timestamp", 6375119433582206027L);
        setField(term97, term97.getClass(), "referent", null);
        setField(term99, term99.getClass(), "lock", term100);
        setField(term99, term99.getClass(), "head", null);
        setLongField(term99, term99.getClass(), "queueLength", -8257434502486459194L);
        setField(term97, term97.getClass(), "queue", term99);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "discovered", null);
        setField(term65, term65.getClass(), "flmref", term97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = term65;
        try {
            callMethod(klass, "setLabelFont", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


