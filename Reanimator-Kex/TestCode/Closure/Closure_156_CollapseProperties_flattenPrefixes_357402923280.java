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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class CollapseProperties_flattenPrefixes_357402923280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180718;
     Object term180822;

    public CollapseProperties_flattenPrefixes_357402923280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180718 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term185250 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term185249 = ((Class) term185250).getDeclaredField((String) "ALIASING_GET");
        ((Field) term185249).setAccessible(true);
        Object enum244 = ((Field) term185249).get((Object) null);
        Object term181014 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term181116 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term181218 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term181116, term181116.getClass(), "twin", term181218);
        setField(term181116, term181116.getClass(), "type", enum244);
        setField(term181014, term181014.getClass(), "twin", term181116);
        setField(term181014, term181014.getClass(), "type", enum244);
        Class<? extends Object> term185558 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term185557 = ((Class) term185558).getDeclaredField((String) "DIRECT_GET");
        ((Field) term185557).setAccessible(true);
        Object enum245 = ((Field) term185557).get((Object) null);
        Class<? extends Object> term185860 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Ref$Type");
        Field term185859 = ((Class) term185860).getDeclaredField((String) "CALL_GET");
        ((Field) term185859).setAccessible(true);
        Object enum246 = ((Field) term185859).get((Object) null);
        Object term181470 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term181572 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term181674 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term181674, term181674.getClass(), "twin", term181014);
        setField(term181674, term181674.getClass(), "type", enum245);
        setField(term181572, term181572.getClass(), "twin", term181674);
        setField(term181572, term181572.getClass(), "type", enum244);
        setField(term181470, term181470.getClass(), "twin", term181572);
        setField(term181470, term181470.getClass(), "type", enum246);
        Object term182076 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term182178 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182076, term182076.getClass(), "twin", term182178);
        setField(term182076, term182076.getClass(), "type", enum244);
        Object term182280 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182280, term182280.getClass(), "twin", term181014);
        setField(term182280, term182280.getClass(), "type", enum246);
        Object term182382 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182382, term182382.getClass(), "twin", term182382);
        setField(term182382, term182382.getClass(), "type", enum246);
        Object term182484 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182484, term182484.getClass(), "twin", term182484);
        setField(term182484, term182484.getClass(), "type", enum245);
        Object term182586 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term182688 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182586, term182586.getClass(), "twin", term182688);
        setField(term182586, term182586.getClass(), "type", enum246);
        Object term182790 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182790, term182790.getClass(), "twin", term182484);
        setField(term182790, term182790.getClass(), "type", enum245);
        Object term182892 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182892, term182892.getClass(), "twin", term181674);
        setField(term182892, term182892.getClass(), "type", enum246);
        Object term182994 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term183096 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term182994, term182994.getClass(), "twin", term183096);
        setField(term182994, term182994.getClass(), "type", enum245);
        Object term183198 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term183198, term183198.getClass(), "twin", null);
        ArrayList term180912 = new ArrayList();
        ((ArrayList) term180912).add(term181014);
        ((ArrayList) term180912).add(term181470);
        ((ArrayList) term180912).add(term182076);
        ((ArrayList) term180912).add(term181572);
        ((ArrayList) term180912).add(term182076);
        ((ArrayList) term180912).add(term182280);
        ((ArrayList) term180912).add(term181116);
        ((ArrayList) term180912).add(term181116);
        ((ArrayList) term180912).add(term182382);
        ((ArrayList) term180912).add(term182076);
        ((ArrayList) term180912).add(term182484);
        ((ArrayList) term180912).add(term182586);
        ((ArrayList) term180912).add(term181674);
        ((ArrayList) term180912).add(term182790);
        ((ArrayList) term180912).add(term182484);
        ((ArrayList) term180912).add(term182076);
        ((ArrayList) term180912).add(term182076);
        ((ArrayList) term180912).add(term182892);
        ((ArrayList) term180912).add(term182994);
        ((ArrayList) term180912).add(term183198);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        ((ArrayList) term180912).add((Object)null);
        term180822 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term180822, term180822.getClass(), "parent", null);
        setField(term180822, term180822.getClass(), "name", "");
        setField(term180822, term180822.getClass(), "declaration", null);
        setField(term180822, term180822.getClass(), "refs", term180912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term180822;
        args[2] = 0;
        try {
            callMethod(klass, "flattenPrefixes", argTypes, term180718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


