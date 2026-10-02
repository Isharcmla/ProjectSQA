import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ConstructorConstructorTest {

    // ---------- Helper classes ----------

    public static class SimpleNoArg {
        public SimpleNoArg() {}
    }

    public static class PrivateNoArg {
        private PrivateNoArg() {}
    }

    public static class NoNoArgConstructor {
        private int x;
        public NoNoArgConstructor(int x) {
            this.x = x;
        }
        public int getX() {
            return x;
        }
    }

    public abstract static class AbstractWithCtor {
        protected AbstractWithCtor() {}
    }

    public static class ThrowingCtor {
        public ThrowingCtor() {
            throw new RuntimeException("boom");
        }
    }

    public enum Color { RED, GREEN, BLUE }

    // ---------- InstanceCreator by exact type ----------

    @Test
    public void testGet_InstanceCreatorByExactType_UsesCreator() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        final SimpleNoArg instance = new SimpleNoArg();
        InstanceCreator<SimpleNoArg> creator = new InstanceCreator<SimpleNoArg>() {
            @Override
            public SimpleNoArg createInstance(Type type) {
                return instance;
            }
        };
        creators.put(SimpleNoArg.class, creator);
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<SimpleNoArg> oc = cc.get(TypeToken.get(SimpleNoArg.class));
        assertSame(instance, oc.construct());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGet_InstanceCreatorByExactParameterizedType_TakesPriorityOverRawType() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        TypeToken<List<String>> tt = new TypeToken<List<String>>() {};
        Type exactType = tt.getType();

        final List<String> exactResult = new ArrayList<String>();
        exactResult.add("exact");
        final List<String> rawResult = new ArrayList<String>();
        rawResult.add("raw");

        InstanceCreator<List<String>> exactCreator = new InstanceCreator<List<String>>() {
            @Override
            public List<String> createInstance(Type type) {
                return exactResult;
            }
        };
        InstanceCreator<List<String>> rawCreator = new InstanceCreator<List<String>>() {
            @Override
            public List<String> createInstance(Type type) {
                return rawResult;
            }
        };

        creators.put(exactType, exactCreator);
        creators.put(List.class, rawCreator);

        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<List<String>> oc = cc.get(tt);
        List<String> result = oc.construct();
        assertSame(exactResult, result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGet_InstanceCreatorByRawTypeFallback_UsedWhenExactTypeMissing() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        final List<Integer> rawResult = new ArrayList<Integer>();
        rawResult.add(42);

        InstanceCreator<List<Integer>> rawCreator = new InstanceCreator<List<Integer>>() {
            @Override
            public List<Integer> createInstance(Type type) {
                return rawResult;
            }
        };
        creators.put(List.class, rawCreator);

        ConstructorConstructor cc = new ConstructorConstructor(creators);
        TypeToken<List<Integer>> tt = new TypeToken<List<Integer>>() {};
        ObjectConstructor<List<Integer>> oc = cc.get(tt);
        List<Integer> result = oc.construct();
        assertSame(rawResult, result);
    }

    // ---------- Default constructor ----------

    @Test
    public void testGet_DefaultConstructor_ReturnsNewInstance() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<SimpleNoArg> oc = cc.get(TypeToken.get(SimpleNoArg.class));
        SimpleNoArg instance = oc.construct();
        assertNotNull(instance);
    }

    @Test
    public void testGet_PrivateDefaultConstructor_SetsAccessibleAndConstructs() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<PrivateNoArg> oc = cc.get(TypeToken.get(PrivateNoArg.class));
        PrivateNoArg instance = oc.construct();
        assertNotNull(instance);
    }

    @Test
    public void testGet_ConstructorThrowsRuntimeException_WrapsAsInvocationTargetException() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<ThrowingCtor> oc = cc.get(TypeToken.get(ThrowingCtor.class));
        try {
            oc.construct();
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testGet_AbstractClassConstructor_ThrowsRuntimeExceptionOnInstantiation() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<AbstractWithCtor> oc = cc.get(TypeToken.get(AbstractWithCtor.class));
        try {
            oc.construct();
            fail("Expected RuntimeException due to InstantiationException");
        } catch (RuntimeException e) {
            // expected
            assertNotNull(e.getMessage());
        }
    }

    // ---------- Default implementation constructors: Collections ----------

    @Test
    public void testGet_ListInterface_UsesArrayList() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<List> oc = cc.get(TypeToken.get(List.class));
        Object result = oc.construct();
        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testGet_SetInterface_UsesLinkedHashSet() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<Set> oc = cc.get(TypeToken.get(Set.class));
        Object result = oc.construct();
        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testGet_SortedSetInterface_UsesTreeSet() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<SortedSet> oc = cc.get(TypeToken.get(SortedSet.class));
        Object result = oc.construct();
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testGet_QueueInterface_UsesLinkedList() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<Queue> oc = cc.get(TypeToken.get(Queue.class));
        Object result = oc.construct();
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testGet_GenericCollectionInterface_UsesArrayList() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<java.util.Collection> oc = cc.get(TypeToken.get(java.util.Collection.class));
        Object result = oc.construct();
        assertTrue(result instanceof ArrayList);
    }

    // ---------- Default implementation constructors: Maps ----------

    @Test
    public void testGet_SortedMapInterface_UsesTreeMap() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<SortedMap> oc = cc.get(TypeToken.get(SortedMap.class));
        Object result = oc.construct();
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testGet_MapWithNonStringKeyParameterized_UsesLinkedHashMap() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        TypeToken<Map<Integer, Integer>> tt = new TypeToken<Map<Integer, Integer>>() {};
        ObjectConstructor<Map<Integer, Integer>> oc = cc.get(tt);
        Object result = oc.construct();
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testGet_MapWithStringKeyParameterized_UsesLinkedTreeMap() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        TypeToken<Map<String, Integer>> tt = new TypeToken<Map<String, Integer>>() {};
        ObjectConstructor<Map<String, Integer>> oc = cc.get(tt);
        Object result = oc.construct();
        assertTrue(result instanceof LinkedTreeMap);
    }

    @Test
    public void testGet_RawMapType_UsesLinkedTreeMap() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<Map> oc = cc.get(TypeToken.get(Map.class));
        Object result = oc.construct();
        assertTrue(result instanceof LinkedTreeMap);
    }

    // ---------- EnumSet handling ----------

    @Test
    public void testGet_EnumSetWithParameterizedClassType_ConstructsEnumSet() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        TypeToken<EnumSet<Color>> tt = new TypeToken<EnumSet<Color>>() {};
        ObjectConstructor<EnumSet<Color>> oc = cc.get(tt);
        EnumSet<Color> result = oc.construct();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test(expected = JsonIOException.class)
    public void testGet_EnumSetRawType_ThrowsJsonIOException() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<EnumSet> oc = cc.get(TypeToken.get(EnumSet.class));
        oc.construct();
    }

    @Test(expected = JsonIOException.class)
    public void testGet_EnumSetWithWildcardType_ThrowsJsonIOException() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        TypeToken<EnumSet<?>> tt = new TypeToken<EnumSet<?>>() {};
        ObjectConstructor<EnumSet<?>> oc = cc.get(tt);
        oc.construct();
    }

    // ---------- Unsafe allocator fallback ----------

    @Test
    public void testGet_NoDefaultConstructorAndNotCollectionOrMap_UsesUnsafeAllocator() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<NoNoArgConstructor> oc = cc.get(TypeToken.get(NoNoArgConstructor.class));
        NoNoArgConstructor instance = oc.construct();
        assertNotNull(instance);
    }

    // ---------- toString ----------

    @Test
    public void testToString_ReturnsInstanceCreatorsMapString() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        InstanceCreator<SimpleNoArg> creator = new InstanceCreator<SimpleNoArg>() {
            @Override
            public SimpleNoArg createInstance(Type type) {
                return new SimpleNoArg();
            }
        };
        creators.put(SimpleNoArg.class, creator);
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        assertEquals(creators.toString(), cc.toString());
    }

    @Test
    public void testToString_EmptyMap_ReturnsEmptyMapString() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        assertEquals(creators.toString(), cc.toString());
    }

    // ---------- Edge case: null TypeToken ----------

    @Test(expected = NullPointerException.class)
    public void testGet_NullTypeToken_ThrowsNullPointerException() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        cc.get(null);
    }

    // ---------- Edge case: empty instanceCreators map with plain class ----------

    @Test
    public void testGet_EmptyInstanceCreatorsMap_FallsBackToDefaultConstructor() {
        ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
        ObjectConstructor<SimpleNoArg> oc = cc.get(TypeToken.get(SimpleNoArg.class));
        SimpleNoArg instance = oc.construct();
        assertNotNull(instance);
        assertNotSame(instance, oc.construct());
    }
}
