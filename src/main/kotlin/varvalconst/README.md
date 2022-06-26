# Var, Val and Const

## Var
- Mutable (Read and Write)
- Runtime
- Primitive types, function, class
- Can be defined everywhere
- Can be initialize later with `lateinit` in the class.
- Can be initialize later without `lateinit` in the function.

## Val
- Immutable (Read only)
- Runtime
- Primitive types, function, class
- Can be defined everywhere
- Can not be initialize later.

## `Co`nst
- Immutable (Read only).
- `Co`mpile-time
- Only primitive types
- At the top-level or member of an `object` or a `companion object`.
- Can not be initialize later.